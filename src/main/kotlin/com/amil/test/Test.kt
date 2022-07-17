package com.amil.test

import org.bukkit.plugin.java.JavaPlugin

class Test : JavaPlugin() {
    override fun onEnable() {
        logger.info("Start Plugin")
    }

    override fun onDisable() {
        logger.info("Exit Plugin")
    }
}