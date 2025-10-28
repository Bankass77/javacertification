package org.example.java17.sealed;

public sealed class Snake {  // Ici la clause permits est optionel

    final class Cobra extends Snake {
    }
}

/*public  sealed class Snake  permits Snake.Cobra {  // si permits est présent, Cobra requière une reférence au nom de Snake

    final class Cobra  extends  Snake {
    }
}*/
