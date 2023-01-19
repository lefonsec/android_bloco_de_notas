package com.empresa.minhasanotaes;

import android.content.Context;
import android.content.SharedPreferences;

public class AnotacaoPreferencias {

    private Context context;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private final String NOME_ARUIVO = "anotacao.preferencias";
    private final String CHAVE_NOME = "nome";


    public AnotacaoPreferencias(Context context) {
        this.context = context;
        this.preferences = this.context.getSharedPreferences(NOME_ARUIVO,0);
        this.editor = this.preferences.edit();

    }

    public void salvarAnotacao(String anotacao) {
        editor.putString(CHAVE_NOME,anotacao);
        editor.commit();
    }


    public String recuperarAnotacao() {
        return preferences.getString(CHAVE_NOME,"");
    }
}
