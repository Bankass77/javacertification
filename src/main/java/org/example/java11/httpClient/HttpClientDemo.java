package org.example.java11.httpClient;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * <p>La classe {@code HttpClientDemo} montre un exemple de l'utilisation de l'API {@link HttpClient}
 * pour effectuer une requête HTTP GET à une URL spécifique.</p>
 *
 * <p>Cette classe permet de :</p>
 * <ul>
 *     <li>Afficher les en-têtes de la réponse HTTP.</li>
 *     <li>Afficher le code de statut HTTP.</li>
 *     <li>Afficher le contenu du corps de la réponse.</li>
 * </ul>
 *
 * <p>Chaque méthode utilise un {@link HttpClient} pour envoyer une requête HTTP à Google et
 * traite la réponse en conséquence.</p>
 *
 * @version 1.0
 */
public class HttpClientDemo {

    /**
     * Point d'entrée du programme. Crée un {@link HttpClient}, envoie une requête HTTP GET à Google,
     * et affiche les en-têtes, le code de statut, et le contenu du corps de la réponse.
     *
     * @param args les arguments de la ligne de commande (non utilisés).
     * @throws IOException si une erreur d'entrée/sortie survient lors de l'envoi de la requête.
     * @throws InterruptedException si l'envoi de la requête est interrompu.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("https://www.google.com")).GET().build();
        printHeader(httpClient);
        printStatus(httpClient, httpRequest);
        printBodyContent(httpClient, httpRequest);
    }

    /**
     * Affiche le contenu du corps de la réponse à la requête HTTP.
     *
     * @param httpClient le client HTTP utilisé pour envoyer la requête.
     * @param httpRequest la requête HTTP à envoyer.
     * @throws IOException si une erreur d'entrée/sortie survient lors de l'envoi de la requête.
     * @throws InterruptedException si l'envoi de la requête est interrompu.
     */
    private static void printBodyContent(final HttpClient httpClient, final HttpRequest httpRequest) throws IOException, InterruptedException {
        var response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println("\n\nBody Content ==>");
        System.out.println(response.body());

    }

    /**
     * Affiche le code de statut de la réponse à la requête HTTP.
     *
     * @param httpClient le client HTTP utilisé pour envoyer la requête.
     * @param httpRequest la requête HTTP à envoyer.
     * @throws IOException si une erreur d'entrée/sortie survient lors de l'envoi de la requête.
     * @throws InterruptedException si l'envoi de la requête est interrompu.
     */
    private static void printStatus(final HttpClient httpClient, final HttpRequest httpRequest) throws IOException, InterruptedException {
        var response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.discarding());
        int statusCode = response.statusCode();
        System.out.println("Http Status code ==>");
        System.out.printf("%d", statusCode);
    }

    /**
     * Affiche les en-têtes de la réponse à une requête HTTP HEAD.
     *
     * @param httpClient le client HTTP utilisé pour envoyer la requête.
     * @throws IOException si une erreur d'entrée/sortie survient lors de l'envoi de la requête.
     * @throws InterruptedException si l'envoi de la requête est interrompu.
     */
    private static void printHeader(final HttpClient httpClient) throws IOException, InterruptedException {
        var request = HttpRequest.newBuilder().uri(URI.create("https://www.google.com")).method("HEAD", HttpRequest.BodyPublishers.noBody()).build();
        var response = httpClient.send(request, HttpResponse.BodyHandlers.discarding());
        HttpHeaders headers = response.headers();
        System.out.println("Header information ==>");
        headers.map().forEach((headerKey, headerValue) -> {
            System.out.printf("%s:,%s\n", headerKey, headerValue);
        });
    }
}
