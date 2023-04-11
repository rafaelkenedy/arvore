package org.example.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj> {

    Integer meuValor;

    public Obj(Integer meuValor) {
        this.meuValor = meuValor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(meuValor, obj.meuValor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
    }

    @Override
    public int compareTo(Obj outro) {


        if (this.meuValor > outro.meuValor) {
            return 1;
        } else if (this.meuValor < outro.meuValor) {
            return -1;

        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return meuValor.toString();
    }
}
