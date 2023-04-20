package fun.suder;

import java.util.stream.Stream;

/**
 * <span>Form File</span>
 * <p>Description</p>
 * <p>Copyright: Copyright (c) 2022 版权</p>
 * <p>Company:QQ 752340543</p>
 *
 * @author topsuder
 * @version v1.0.0
 * @DATE 2023/4/20-10:45
 * @Description
 * @see fun.suder Filter-Id
 */
public class FilterIDTest {

    public static void main(String[] args) {
        System.out.println(filterId("4301242260039"));
    }

    public static boolean filterId(String id) {
        String filterId = "4301242260039-1A---00----3/0----2A-------01";
        return Stream.of(filterId.split("/"))
                .anyMatch(data->data.substring(0, filterId.indexOf("-")).equals(id));
    }

}
