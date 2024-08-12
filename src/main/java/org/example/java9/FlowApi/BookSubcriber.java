package org.example.java9.FlowApi;

import lombok.RequiredArgsConstructor;
import lombok.extern.flogger.Flogger;

import java.util.concurrent.Flow;
import java.util.logging.Logger;


/**
 * Subscriber : Un abonné aux données. Il reçoit les éléments publiés par un Publisher. Donc, il reçoit et traite les éléments.
 */
@RequiredArgsConstructor
public class BookSubcriber implements Flow.Subscriber<Book> {


   static Logger log = Logger.getLogger(BookSubcriber.class.getName());
    private Flow.Subscription subscription;

    private String subcriberName;

    public BookSubcriber(String subcriberName) {
        this.subcriberName = subcriberName;
    }

    /**
     * onSubscribe(Subscription subscription) : Cette méthode est appelée lorsque le Subscriber s'abonne au Publisher. Elle reçoit une instance de Subscription,
     * que le Subscriber utilise pour demander des livres (books). Ici, nous demandons un livre initial avec subscription.request(1).
     *
     * @param subscription
     *         une instance de Subcription
     */
    @Override
    public void onSubscribe(Flow.Subscription subscription) {

        this.subscription = subscription;
        subscription.request(1);

    }

    /**
     * Cette méthode est appelée chaque fois qu'un nouveau livre (book) est publié. Ici, nous imprimons le livre  (book) reçu et demandons le prochain livre
     * avec subscription.request(1).
     *
     * @param book
     *         élément réçu
     */
    @Override
    public void onNext(Book book) {
        subscription.request(1);
        log.info(book + ", Received by: " + this.subcriberName);

        if(book.getBookName().equals("Java 17")){

            log.info(subcriberName +  " cancelling subcription.");
            subscription.cancel();
        }
    }

    /**
     * Cette méthode est appelée si une erreur se produit. Ici, nous imprimons la trace de l'erreur.
     *
     * @param throwable
     */
    @Override
    public void onError(Throwable throwable) {
        log.info(" Error: " + throwable.getMessage());

    }

    /**
     * Cette méthode est appelée lorsque le Publisher a publié tous ses éléments et a terminé.
     */
    @Override
    public void onComplete() {
        log.info(this.subcriberName + " " + "got all the books");

    }
}
