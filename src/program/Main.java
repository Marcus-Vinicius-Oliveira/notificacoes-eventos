package program;

import services.Messenger;

public class Main {

    public static void main(String[] args) {

        Boolean checker = Boolean.TRUE;
        Messenger messenger = new Messenger();
        while (checker) {
            messenger.numPerson();
            if (messenger.getNumPerson() <= 0){
                checker = Boolean.FALSE;
            }
            messenger.reciveMensage();
            messenger.namePerson();
            messenger.showMensage();
            messenger.clearRegistry();
        }
    }

}
