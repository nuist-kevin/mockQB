package com.mic.test.cb.qb.persist.dao.cb;

import com.mic.test.cb.BaseTest;
import com.mic.test.cb.qb.persist.dao.api.QBWCSessionJpaRepository;
import com.mic.test.cb.qb.persist.dao.api.QBWCTaskJpaRepository;
import com.mic.test.cb.qb.persist.domain.api.QBWCSession;
import com.mic.test.cb.qb.persist.domain.api.QBWCTask;
import com.mic.test.cb.qb.persist.domain.cb.QBVendor;
import com.mic.test.cb.qb.ws.domain.Authenticate;
import com.mic.test.cb.qb.ws.domain.AuthenticateResponse;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;

import javax.annotation.Resource;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class VendorTest extends BaseTest {

  @Resource
  private QBWCTaskJpaRepository qbwcTaskJpaRepository;
  @Resource
  private QBWCSessionJpaRepository qbwcSessionJpaRepository;

  @Before
  public void createTicket() {
    //TODO 准备数据
  }

  @Test
  public void authenticatePassAndAddVendorTask() {
    Authenticate authenticate = new Authenticate();
    authenticate.setStrUserName("gzc");
    authenticate.setStrPassword("pass");
    AuthenticateResponse authicateResponse =
        (AuthenticateResponse) webServiceTemplate.marshalSendAndReceive(WSDLLOCATION, authenticate);
    ticket = authicateResponse.getAuthenticateResult().getString().get(0);
    // 检查请求的响应
    Assert.assertNotNull(ticket);
    Assert.assertEquals(authicateResponse.getAuthenticateResult().getString().get(1), "");

    // 检查数据库数据
    // 检查session表
    QBWCSession qbwcSession = qbwcSessionJpaRepository.findByTicket(ticket);
    Assert.assertNotNull(qbwcSession);
    Assert.assertEquals(qbwcSession.getStatus(), Integer.valueOf(0));
    // 检查 task 表
    List<QBWCTask> addVendorTasks = qbwcTaskJpaRepository
        .findByTicketAndStatusAndType(ticket, 0, 4);
    // 根据准备的数据量，断言应该能查到几条数据
    assertThat(addVendorTasks, Matchers.hasSize(8));

    assertThat(addVendorTasks, Matchers.hasItem(null));


  }

/*    @Test
    @Sql(statements = {"delete from cb.wms_qb_vendor;"},config = @SqlConfig(dataSource = "cbDataSource"))
    public void testVendor() {
//        QBVendor qbVendor = qbVendorJpaRepository.findOne(361);
//        System.out.println(qbVendor.getUpdateName());

    }*/
}
