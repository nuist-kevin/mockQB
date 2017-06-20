package com.mic.test.cb.qb.persist.config;

import java.util.Locale;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

/**
 * Created by caiwen on 2017/6/19.
 */
public class CustomNamingStrategy extends PhysicalNamingStrategyStandardImpl {

  @Override
  public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
    return new Identifier(addUnderscores(name.getText()), name.isQuoted());
  }

  protected static String addUnderscores(String name) {
    StringBuilder buf = new StringBuilder(name.replace('.', '_'));
    for (int i = 1; i < buf.length() - 1; i++) {
      if (
          Character.isLowerCase(buf.charAt(i - 1)) &&
              Character.isUpperCase(buf.charAt(i)) &&
              Character.isLowerCase(buf.charAt(i + 1))
          ) {
        buf.insert(i++, '_');
      }
    }
    return buf.toString().toLowerCase(Locale.ROOT);
  }
}
