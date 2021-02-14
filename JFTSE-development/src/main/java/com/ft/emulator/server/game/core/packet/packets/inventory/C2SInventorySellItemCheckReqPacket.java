package com.ft.emulator.server.game.core.packet.packets.inventory;

import com.ft.emulator.server.networking.packet.Packet;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class C2SInventorySellItemCheckReqPacket extends Packet {
    private int itemPocketId;

    public C2SInventorySellItemCheckReqPacket(Packet packet) {
        super(packet);

        this.itemPocketId = this.readInt();
    }
}
