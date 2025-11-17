package com.caue.suaextensao

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class SuaExtensao : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.d("SuaExtensao", "Extensão ativada: \\$intent.action")
        // TODO: implementar lógica da extensão aqui
    }
}