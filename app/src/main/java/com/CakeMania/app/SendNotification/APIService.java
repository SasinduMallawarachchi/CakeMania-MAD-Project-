package com.CakeMania.app.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAm0YCsDU:APA91bGws8_gapL27VVvrm4RvW9Ky93w7pk2pMvH5A19Nt2220SaCADcKognuDiIp9ql11ITQzRG5HSoERAT4qYNgzgjEMwllGHUoZwIeSrkMp3cgPpbdmknP2-1WKBMvPyjx4dN103f "
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
