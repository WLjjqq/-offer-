package java;

/**
 * 去除换行符号
 * Create by 六
 * Date:18-7-4
 */
public class ReplaceAll {
    public static void main(String[] args) {

        String s = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDHJh993dgz9/Er\n" +
                "S1AhzeYucnxJiSRcxCDHqmHDnQQUt6dcM5hSNcWED016ci/TcSzkJhXFWpSTUsmU\n" +
                "0+at/Vhp6TFx9zCaBWESo5qloS78txLQOlZ5dNWtaAPFoXPWqwnildS3AU6tNjFT\n" +
                "TxBRJH3X0HbMpjEj/kg+Kh1CkdXLP8sL727AGPh5meDOng+mHJjtfvh40kR3CsQN\n" +
                "T6fXegRgDa1wy0/u/G9mZSgEhK6flx64lah34AvgcrRYbc8gklMsk3ch6AMKRDt+\n" +
                "/E910kK9bhshcEpsNfRXTWxzH/E83kC0uDzmKpmnfC3tkZ3LeSOGSy9XciaYc/WA\n" +
                "FevHSoqNAgMBAAECggEBALm+vwSgk/T0vwYIerbs2lJcCbx0o2u6qnBQZFsU6ieA\n" +
                "nCKNJPcYnB7uPu+D7UOjfaFWPFwUfhtizg14DuIdOAegrrODQNuHROEjoyv0yGSB\n" +
                "RJTetKUX6eyQ5WPBkM+aO+AQq5P9Liq0LxFq3ucvyAgwsX1zTMYrd6ozkZLzfprQ\n" +
                "P4VnQXG02UEMcOM/DT67OSgp6NI4P3wNOS9+E/lJD8V8qVBGh4K+qHOaBJYXwZC9\n" +
                "zNKa07nSo47OOPu/b2Pws4fmI6cJLs4cBvtJRL2tXFJCXPXyBLE2OoJauyflWlWP\n" +
                "HEVmb29oDS67IVf048vrftivz3f+KYlSFuds5lO5bKkCgYEA/DKLFJ4skRoEj6Yr\n" +
                "0+EsfcbHSeNzNFw9NDIU5DZpejqlMLQq0ZQhnzXvF1kHVhAqbJTsu0SpJ0dTJeHT\n" +
                "2j27ATthOC/TT0dUiySEsTTwx4a3HFlpUofGv9bRTFvsPR9Pov035yne0VszvCS6\n" +
                "yZkuzu6N/9jk/ANUph2Bdch/zdMCgYEAyibRWwqeq1AL+2mpwcFEZ21MfQV01W/c\n" +
                "FuBzcqBMTImNLgW1nFgy5EhW8EdksCF3G/Y2X4GsFg2em0/6LUsshj+oLw8+O1UQ\n" +
                "HeH3kElU9pIcxulEnTLdXofq7U/Ut5ia3NqgvRssusaOfEZ40O0l9UE18ZZMoVEE\n" +
                "eNUOtjREKh8CgYB1I2TGJtG8c8E6l4wz1Zq8sN9Pyn1wDIfA/qIFfeBwDV08yfI5\n" +
                "dfxH3t02kvt9VfTeii2KrdGDlPVh2wpzi8iYQeReHJihchgqqMOZK2XKxx+14zGw\n" +
                "S7Bc2oJMXUXU/f4XTlXw4NnFk/7rnIPFr4i2RMdf1nZFN6bRoVLISmBSUQKBgQC0\n" +
                "nYgyesOXttZt1FOLPR3b9wj/Ly/bP616dyJPSS/CtqeAdjN0tE0MMCIVXwR0ZgIg\n" +
                "5pRgMuDJd3O9uvCBJYhrjla7bTgiFPdoa6wgq5SRFa1Gf8cBWR/2xSO+0rPxMhUz\n" +
                "vNce/zewzZUjLmfl6+0dOx1yc+KVw2hmeZ5CZ2J76wKBgQC+fS+34YeX16p1ytvO\n" +
                "HPzBY4qE87GO/3C75r0iC6tjam/RfZBL4RJpaigL06d/CBeVVLbhAchvt6EzhMM5\n" +
                "ecoL3w04q9Bcf8JS2GN3JlfW5WD/DX1z0odmrbQcKCTkDKAy6ja77GFEKKv1QqUy\n" +
                "g5j5iQC0WPD+MktVhBFn85AqsQ==";
        System.out.println("转换前："+s);
        //去除空格。
        s = s.replaceAll("\r|\n", "");
        System.out.println("转换后："+s);
    }
}
