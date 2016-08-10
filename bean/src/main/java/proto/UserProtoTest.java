package proto;

import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.InvalidProtocolBufferException;

public class UserProtoTest {

    private static byte[] encode(UserProto.User user) {
        return user.toByteArray();
    }

    private static UserProto.User decode(byte[] body)
            throws InvalidProtocolBufferException {
        return UserProto.User.parseFrom(body);
    }

    public static void main(String[] args)
            throws InvalidProtocolBufferException {

        UserProto.User.Builder builder = UserProto.User.newBuilder();
        builder.setID(1);
        builder.setUserName("我的名字");
        builder.setPassword("Netty Book");
        List<String> address = new ArrayList<String>();
        address.add("NanJing YuHuaTai");
        address.add("BeiJing LiuLiChang");
        address.add("ShenZhen HongShuLin");
        builder.addAllAddress(address);
        UserProto.User user = builder.build();

        System.out.println("Before encode : " + user.toString());
        UserProto.User user2 = decode(encode(user));
        System.out.println("After decode : " + user2.toString());

    }

}