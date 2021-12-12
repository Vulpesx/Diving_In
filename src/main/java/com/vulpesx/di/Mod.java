package com.vulpesx.di;

import com.vulpesx.di.common.item.DIItems;
import net.fabricmc.api.ModInitializer;

public class Mod implements ModInitializer {

    public static final String MODID = "di";

    @Override
    public void onInitialize() {
        DIItems.init();
    }
}
