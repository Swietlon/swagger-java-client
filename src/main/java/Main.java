import io.swagger.client.*;
import io.swagger.client.auth.*;

import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        DefaultApi apiInstance = new DefaultApi(new ApiClient());
        Float x = 3.4F; // Float | The dividend
        Float y = 3.4F; // Float | The divider
        try {
            Float result = apiInstance.divisionGet(x, y);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#divisionGet");
            e.printStackTrace();
        }
    }
}
