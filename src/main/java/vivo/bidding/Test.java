package vivo.bidding;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.TextFormat;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws TextFormat.ParseException, InvalidProtocolBufferException {
        VivoBidding2.BidRequest.Builder builder = VivoBidding2.BidRequest.newBuilder();
        //System.out.println(bidRequest.toString());
        CharSequence myText="id: \"1547535317289_c1d0930dd50144ac99146c700cadb5dd\"\n" +
                //"ver: 1\n" +
                "imp {\n" +
                "  id: 1\n" +
                "  tag_id: \"58a469f76d9a4a53aa651b875c4e2775\"\n" +
                "  ad_type: 2\n" +
                "  deeplink: true\n" +
                "  bid_floor: 1\n" +
                "  template_ids: 4015\n" +
                "  template_ids: 4009\n" +
                "  bid_types: 1\n" +
                "}\n" +
                "device {\n" +
                "  ip: \"118.75.157.27\"\n" +
                "  make: \"vivo\"\n" +
                "  model: \"vivo X27\"\n" +
                "  os: \"Android\"\n" +
                "  osv: \"9.0.1\"\n" +
                "  net_type: 2\n" +
                "  did_md5: \"0ba2c062976f781abeddcb11e5624908\"\n" +
                "}\n" +
                "at: 2\n" +
                "geo {\n" +
                "  lat: 31.99452\n" +
                "  lon: 118.73314\n" +
                "}\n" +
                "app {\n" +
                "  bundle: \"com.jd.game.onetpet.vivo\"\n" +
                "}\n" +
                "query: \"\\347\\254\\224\\350\\256\\260\\346\\234\\254\"\n";
        com.google.protobuf.TextFormat.getParser().merge(myText, builder);

        VivoBidding2.BidRequest build = builder.build();
        System.out.println(Arrays.toString(build.toByteArray()));
        VivoBidding.BidRequest bidRequest = VivoBidding.BidRequest.parseFrom(build.toByteArray());
        System.out.println(Arrays.asList(bidRequest));
    }
}
