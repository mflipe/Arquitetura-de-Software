package p2;

import java.util.ArrayList;

public class Utils {

    /**
     * retorna todas as strings em 'lista' que possuem 'sub' como substring
     */
    public ArrayList<String> pegarTodasComSubstring(ArrayList<String> lista, String sub)
            throws Exception {
        checkLista(lista);

        checkString(sub);

        return selecionaString(lista, sub);
    }

    public void checkLista(ArrayList<String> lista)
            throws Exception {
        if (lista == null) {
            throw new Exception("lista nula");
        }
    }

    public void checkString(String sub)
            throws Exception {
        if (sub == null) {
            throw new Exception("substring nula");
        }
    }

    public ArrayList<String> selecionaString(ArrayList<String> lista, String sub) {
        ArrayList<String> ret = new ArrayList<String>();

        for (int i = 0; i < lista.size(); i++) {
            String s = lista.get(i);
            if (s.contains(sub)) {
                ret.add(s);
            }
        }
        return ret;
    }
}
