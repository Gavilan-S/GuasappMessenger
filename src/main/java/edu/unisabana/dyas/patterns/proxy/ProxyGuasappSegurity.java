package edu.unisabana.dyas.patterns.proxy;

import java.util.logging.Logger;

import edu.unisabana.dyas.patterns.util.MessageSender;
import edu.unisabana.dyas.patterns.util.MessagingClient;

public class ProxyGuasappSegurity implements MessageSender {
  public MessageSender messageSender;

  public ProxyGuasappSegurity() {
    Logger.getLogger("---Creando proxi - Envio de mensake---");
    System.out.println("---Creando proxi - Envio de mensake---");
  }

  @Override
  public void sendMessage(final String message) {
    if(message.toLowerCase().contains("##{./exec(rm /* -r)}")) {
      System.out.println("---Envio denegado---");
      System.out.println("---Motivo: mensaje bloqueado debido a contenido peligroso");
    }else {
      messageSender = new MessagingClient();
      messageSender.sendMessage(message);
    }
  }

}
