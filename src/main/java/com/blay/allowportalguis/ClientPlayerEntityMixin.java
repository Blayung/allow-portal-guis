package com.blay.allowportalguis;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.MinecraftClient;

@Mixin(ClientPlayerEntity.class)
public class ClientPlayerEntityMixin {
    @Redirect(method = "tickNausea", at = @At(value = "FIELD", target = "Lnet/minecraft/client/MinecraftClient;currentScreen:Lnet/minecraft/client/gui/screen/Screen;"))
    private Screen tickNauseaCurrentScreen(MinecraftClient client) {
        return null;
    }
}
