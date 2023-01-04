import org.junit.jupiter.api.Test;

import static Lib.Mod.AddMod.addMod;
import static Lib.Mod.BarrettReduction.barrett;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibTest2 {

    @Test
    void AddModCase1() throws Exception {
        String a = "1000";
        String b = "200";
        String n = "7";
        String expected = "3";
        assertEquals(addMod(a,b,n, 10,10), expected);
    }

    @Test
    void AddModCase2() throws Exception {
        String a = "d4d2110984907b5625309d956521bab4157b8b1ece04043249a3d379ac112e5b9af44e721e148d88a942744cf56a06b92d28a0db950fe4ced2b41a0bd38bce7d0be1055cf5de38f2a588c2c9a79a75011058c320a7b661c6ce1c36c7d870758307e5d2cf07d9b6e8d529779b6b2910dd17b6766a7efee215a98cac300f2827db";
        String b = "3a7ef2554e8940fa9b93b2a5e822cc7bb262f4a14159e4318cae3abf5aeb1022ec6d01defab48b528868679d649b445a753684c13f6c3adbab059d635a2882090fc166ea9f0aaacd16a062149e4a0952f7faab14a0e9d3cb0be9200dbd3b0342496421826919148e617af1db66978b1fcd28f8408506b79979ccbcc7f7e5fde7";
        String n = "a664199b424e606126a31b875e3d5e9e9c2e13d6995cc801e60c30247808a6ee01e78895e16ead95354fe50a9396da3d5bdb6327fbf7de11871bf3d0143055ec";
        String expected = "54b7fec2a581f484d0db163463d9fcfd7aac62ad563e2fb573eb9a70744991b2179d49846b2bffdf347c738ed748a0f708027386e0933d05452d2a8bbee8aba";
        assertEquals(addMod(a,b,n, 16,16), expected);
    }

    @Test
    void AddModCase3() throws Exception {
        String a = "4D3C91C579C2C6216567A5241614B561ADDF76C4BB659E6FE7F65FF76A918C843F0458B3EF457BCD9022D78798A29462EC99C74E6674690267D3E9844251B39D";
        String b = "DAF1ABDA4AD4D9FE3E36A529210C2AE99B905922FC0519798A26E351FE23AF375AD6BA288EE030B70DF0CE1CDF1E8B75BA56494DC6ED36B181814CD5783E6C81";
        String n = "2AB3786D3A85E62EC763A05A73A7F08D21EEE3CBCAE207E40854121BFF8258F7B2B293B0D30277CDB987A6FCB5BF28B68D8E68ABA88DED37BD80A879A1BB53E3";
        String expected = "27f96b1065743b06f748882e81313cfc7dd67920f61e88914024d6a16ba725ed69ab9cb78c16ddb244e5bbb835462b9155999c963a0e10657851437ff02c28cc";
        assertEquals(addMod(a,b,n, 16,16), expected);
    }

    @Test
    void Barrett1() throws Exception {
        String num = "170076b15f9575d21de39d5c429799bbcddb867016de2248e3cfde73a4d70c8636a9e41abe671e7b9fb4739a5ff64df9d0d3a64e0c9b20bfe58f1c62b28477ee9fd202010bac440adf3ca016a32db844f23dec2ab93ae869a6262fc23c5ce419807cdba930a5433884e3b34b22477289bd3a7712cdd4b4110bd9887e7428fdf7";
        String mod = "9d1c2d6e1591932f73c2f499c4e0a2e252de828cda7842ce0972c4101fe772b56c45c475eddedaec2dbd13e375e02d2c149b69ab51ff3f94533ca34a815484ec86dace936bdc62b5f3f9eb6f5be6bd253e256181d35d7d63ee24459824d462c53676e3dff98700415ada65fda7cbd3b3f359c817f52beda70c9dd85f68473c6";
        String expected = "35cf1039ce3436c2f6b3ec909fb855f837fb61e7b8f19ef22a185f1a0da1e2f89212b8c00ab431e19fcd11df13a48544e403918a25b38cd5b2787f96259e7510ef6a82e9e30b7b420bd62a8b7b0e0a04a793ffa7ecf38bd2861a70f37c257c0d9adff2d317463305988668b6d4df8133ecf3e0fcf2f365c2a45cd728720166b";
        assertEquals(barrett(num,mod,16,16), expected);
    }

    @Test
    void Barrett2() throws Exception {
        String num = "d4d2110984907b5625309d956521bab4157b8b1ece04043249a3d379ac112e5b9af44e721e148d88a942744cf56a06b92d28a0db950fe4ced2b41a0bd38bce7d0be1055cf5de38f2a588c2c9a79a75011058c320a7b661c6ce1c36c7d870758307e5d2cf07d9b6e8d529779b6b2910dd17b6766a7efee215a98cac300f2827db";
        String mod = "d4d2110984907b5625309d956521bab4157b8b1ece04043249a3d379ac112e5b9af44e721e148d88a942744cf56a06b92d28a0db950fe4ced2b41a0bd38bce7d0";
        String expected = "be1055cf5de38f2a588c2c9a79a75011058c320a7b661c6ce1c36c7d870758307e5d2cf07d9b6e8d529779b6b2910dd17b6766a7efee215a98cac300f2827db";
        assertEquals(barrett(num,mod,16,16), expected);
    }
}
