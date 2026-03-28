package com.blay.allowportalguis;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At;

import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.gui.screens.Screen;

@Mixin(LocalPlayer.class)
public class LocalPlayerMixin {
    @Redirect(method = "handlePortalTransitionEffect", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screens/Screen;isAllowedInPortal()Z"))
    private boolean handlePortalTransitionEffectIsAllowedInPortal(Screen screen) {
        return true;
    }
}
