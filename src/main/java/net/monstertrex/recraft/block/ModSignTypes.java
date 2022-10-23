package net.monstertrex.recraft.block;

import net.minecraft.util.SignType;
import net.monstertrex.recraft.mixin.SignTypeAccessor;

public class ModSignTypes {
    public static final SignType BAMBOO =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("bamboo"));

    public static final SignType DRIED_BAMBOO =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("dried_bamboo"));
}