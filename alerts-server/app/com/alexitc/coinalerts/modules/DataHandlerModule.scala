package com.alexitc.coinalerts.modules

import com.alexitc.coinalerts.data.anorm.{FixedPriceAlertPostgresDataHandler, UserPostgresDataHandler}
import com.alexitc.coinalerts.data.{FixedPriceAlertBlockingDataHandler, UserBlockingDataHandler}
import com.google.inject.AbstractModule

class DataHandlerModule extends AbstractModule {

  override def configure(): Unit = {
    bind(classOf[UserBlockingDataHandler]).to(classOf[UserPostgresDataHandler])
    bind(classOf[FixedPriceAlertBlockingDataHandler]).to(classOf[FixedPriceAlertPostgresDataHandler])
  }
}
