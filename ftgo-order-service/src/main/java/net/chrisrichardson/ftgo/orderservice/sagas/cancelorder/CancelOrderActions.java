package net.chrisrichardson.ftgo.orderservice.sagas.cancelorder;

import io.eventuate.tram.commands.consumer.CommandWithDestination;
import net.chrisrichardson.ftgo.orderservice.api.OrderServiceChannels;
import net.chrisrichardson.ftgo.orderservice.sagaparticipants.BeginCancelCommand;
import static io.eventuate.tram.commands.consumer.CommandWithDestinationBuilder.send;

class CancelOrderActions {
  CommandWithDestination beginCancel(CancelOrderSagaData data) {
    return send(new BeginCancelCommand(data.getOrderId() + 1))
            .to(OrderServiceChannels.COMMAND_CHANNEL)
            .build();
  }
}
