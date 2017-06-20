package com.mic.test.cb.qb.persist.dao;

import java.time.LocalDateTime;
import java.util.Calendar;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Calendar> {

  @Override
  public Calendar convertToDatabaseColumn(LocalDateTime localDateTime) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(localDateTime.getYear(), localDateTime.getMonthValue() - 1,
        localDateTime.getDayOfMonth(),
        localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
    return calendar;
  }

  @Override
  public LocalDateTime convertToEntityAttribute(Calendar calendar) {
    return LocalDateTime.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1,
        calendar.get(Calendar.DAY_OF_MONTH),
        calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE),
        calendar.get(Calendar.SECOND)
    );
  }
}
