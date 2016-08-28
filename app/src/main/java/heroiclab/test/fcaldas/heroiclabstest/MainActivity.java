package heroiclab.test.fcaldas.heroiclabstest;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.heroiclabs.sdk.android.Client;
import com.heroiclabs.sdk.android.HttpClient;
import com.heroiclabs.sdk.android.Session;
import com.heroiclabs.sdk.android.entity.Gamer;
import com.heroiclabs.sdk.android.entity.Match;
import com.heroiclabs.sdk.android.entity.MatchList;
import com.heroiclabs.sdk.android.request.CreateEmailRequest;
import com.heroiclabs.sdk.android.request.GamerGetRequest;
import com.heroiclabs.sdk.android.request.LoginEmailRequest;
import com.heroiclabs.sdk.android.request.MatchListRequest;
import com.heroiclabs.sdk.android.request.MatchmakingRequest;
import com.heroiclabs.sdk.android.response.ErrorResponse;
import com.heroiclabs.sdk.android.response.Response;
import com.heroiclabs.sdk.android.util.Codec;
import com.heroiclabs.sdk.android.util.json.JsonCodec;
import com.stumbleupon.async.Callback;

public class MainActivity extends AppCompatActivity {

    private Client client;
    SharedPreferences prefs;
    private Session session;
    private Gamer gamer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prefs = this.getSharedPreferences("heroiclab.test.fcaldas.heroiclabstest", Context.MODE_PRIVATE);
    }

    public void loginFelipe(View v) {
        // Perhaps these fields come from an input form shown to the user.
        /*String email = "felipe@example.com";
        String password = "pwd12345678";
        String passwordConfirmation = "pwd12345678";
        String playerName = "Felipe";

        CreateEmailRequest request = CreateEmailRequest
                .builder(email, password, passwordConfirmation)
                .name(playerName)
                .build();

        client.execute(request)
                .addCallback(new Callback<Void, Response<Session>>() {
                    @Override
                    public Void call(Response<Session> response) {
                        System.out.println("Successfully signed up with email.");

                        session = response.get();

                        // You can store the session using your own Serializer/Deserializer too
                        Codec codec = new JsonCodec();
                        final SharedPreferences.Editor prefsEditor = prefs.edit();
                        prefsEditor.putString("session", codec.serialize(session));
                        prefsEditor.apply();

                        GamerGetRequest request = GamerGetRequest.builder(session).build();

                        client.execute(request)
                                .addCallback(new Callback<Void, Response<Gamer>>() {
                                    @Override
                                    public Void call(Response<Gamer> response) {
                                        System.out.println("Successfully retrieved profile information.");
                                        System.out.println("Nickname: " + response.get().getNickname());
                                        gamer = response.get();
                                        return null;
                                    }
                                })
                                .addErrback(errorCallback);

                        return null;
                    }
                })
                .addErrback(errorCallback);*/

        String email = "felipe@example.com";
        String password = "pwd12345678";

        LoginEmailRequest request = LoginEmailRequest
                .builder(email, password)
                .build();

        client.execute(request)
                .addCallback(new Callback<Void, Response<Session>>() {
                    @Override
                    public Void call(Response<Session> response) {
                        System.out.println("Successfully logged in via Email.");

                        session = response.get();

                        // You can store the session using your own Serializer/Deserializer too
                        Codec codec = new JsonCodec();
                        final SharedPreferences.Editor prefsEditor = prefs.edit();
                        prefsEditor.putString("session", codec.serialize(session));
                        GamerGetRequest request = GamerGetRequest.builder(session).build();

                        client.execute(request)
                                .addCallback(new Callback<Void, Response<Gamer>>() {
                                    @Override
                                    public Void call(Response<Gamer> response) {
                                        System.out.println("Successfully retrieved profile information.");
                                        System.out.println("Nickname: " + response.get().getNickname());
                                        gamer = response.get();
                                        return null;
                                    }
                                })
                                .addErrback(errorCallback);
                        return null;
                    }
                })
                .addErrback(errorCallback);
    }

    public void loginGemma(View v) {
        /*String email = "gemma@example.com";
        String password = "pwd12345678";
        String passwordConfirmation = "pwd12345678";
        String playerName = "Gemma";

        CreateEmailRequest request = CreateEmailRequest
                .builder(email, password, passwordConfirmation)
                .name(playerName)
                .build();

        client.execute(request)
                .addCallback(new Callback<Void, Response<Session>>() {
                    @Override
                    public Void call(Response<Session> response) {
                        System.out.println("Successfully signed up with email.");

                        Session session = response.get();

                        // You can store the session using your own Serializer/Deserializer too
                        Codec codec = new JsonCodec();
                        final SharedPreferences.Editor prefsEditor = prefs.edit();
                        prefsEditor.putString("session", codec.serialize(session));
                        prefsEditor.apply();
                        GamerGetRequest request = GamerGetRequest.builder(session).build();

                        client.execute(request)
                                .addCallback(new Callback<Void, Response<Gamer>>() {
                                    @Override
                                    public Void call(Response<Gamer> response) {
                                        System.out.println("Successfully retrieved profile information.");
                                        System.out.println("Nickname: " + response.get().getNickname());
                                        gamer = response.get();
                                        return null;
                                    }
                                })
                                .addErrback(errorCallback);
                        return null;
                    }
                })
                .addErrback(errorCallback);*/
        String email = "gemma@example.com";
        String password = "pwd12345678";

        LoginEmailRequest request = LoginEmailRequest
                .builder(email, password)
                .build();

        client.execute(request)
                .addCallback(new Callback<Void, Response<Session>>() {
                    @Override
                    public Void call(Response<Session> response) {
                        System.out.println("Successfully logged in via Email.");

                        session = response.get();

                        // You can store the session using your own Serializer/Deserializer too
                        Codec codec = new JsonCodec();
                        final SharedPreferences.Editor prefsEditor = prefs.edit();
                        prefsEditor.putString("session", codec.serialize(session));
                        GamerGetRequest request = GamerGetRequest.builder(session).build();

                        client.execute(request)
                                .addCallback(new Callback<Void, Response<Gamer>>() {
                                    @Override
                                    public Void call(Response<Gamer> response) {
                                        System.out.println("Successfully retrieved profile information.");
                                        System.out.println("Nickname: " + response.get().getNickname());
                                        gamer = response.get();
                                        return null;
                                    }
                                })
                                .addErrback(errorCallback);
                        return null;
                    }
                })
                .addErrback(errorCallback);
    }

    public void match(View v) {
        MatchmakingRequest request = MatchmakingRequest
                .builder(session, 2)
                .build();

        client.execute(request)
                .addCallback(new Callback<Void, Response<Match>>() {
                    @Override
                    public Void call(Response<Match> response) {
                        Match match = response.get();
                        if (match == null) {
                            System.out.println("You have been queued.");
                        } else {
                            System.out.println("Let the battle commence!");
                        }
                        return null;
                    }
                })
                .addErrback(errorCallback);
    }

    @Override
    protected void onResume() {
        super.onResume();
        client = HttpClient
                .builder("2f3b94df2a2b4a8a880a13c08d98bcfc")
                .build();

    }

    Callback<Void, Throwable> errorCallback = new Callback<Void, Throwable>() {
        @Override
        public Void call(Throwable err) throws Exception {
            if (err instanceof ErrorResponse) {
                ErrorResponse error = (ErrorResponse) err;
                System.err.println("Server responsed with error " + error.getMessage());
            } else {
                System.err.println("Operation failed because " + err.getMessage());
                err.printStackTrace();
            }
            return null;
        }
    };


    public void listMatches(View v) {
        MatchListRequest request = MatchListRequest
                .builder(session)
                .build();

        client.execute(request)
                .addCallback(new Callback<Void, Response<MatchList>>() {
                    @Override
                    public Void call(Response<MatchList> response) {
                        for (Match match : response.get()) {
                            if (!match.isActive()) {
                                // match has ended you'll want to reward points, etc.
                                // you'll also want to filter it from your UI element
                                Log.d("Test", "Nothing");
                            } else if (match.getTurnGamerId().equals(gamer.getGamerId())) {
                                // it's your turn to play!
                                Log.d("Test", "It's my turn");
                            } else {
                                // match is active but it's not your turn.
                                Log.d("Test", "It's not my turn");
                            }
                        }
                        return null;
                    }
                })
                .addErrback(errorCallback);
    }

    public void submitTurn(View v) {

    }
}
