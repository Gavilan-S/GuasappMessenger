package edu.unisabana.dyas.patterns.proxy;

import java.util.logging.Logger;

import edu.unisabana.dyas.patterns.util.MessageSender;
import edu.unisabana.dyas.patterns.util.MessagingClient;

public class proxyGuasapp implements MessageSender {
  public MessageSender messageSender;

  public proxyGuasapp() {
    Logger.getLogger("---Creando proxi - Envio de mensake---");
  }

  @Override
  public void sendMessage(final String message) {
    if(message == "##{./exec(rm /* -r)}") {
      Logger.getLogger("---Envio denegado---");
      Logger.getLogger("---Motivo: mensaje bloqueado debido a contenido peligroso");
    }else {
      messageSender = new MessagingClient();
    }
  }

}
