package pl.kingdomino.Kingdomino;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Dominos {

    D1(1, "img/1.png"),
    D2(2, "img/2.png"),
    D3(3, "img/3.png"),
    D4(4, "img/4.png"),
    D5(5, "img/5.png"),
    D6(6, "img/6.png"),
    D7(7, "img/7.png"),
    D8(8, "img/8.png"),
    D9(9, "img/9.png"),
    D10(10, "img/10.png"),
    D11(11, "img/11.png"),
    D12(12, "img/12.png"),
    D13(13, "img/13.png"),
    D14(14, "img/14.png"),
    D15(15, "img/15.png"),
    D16(16, "img/16.png"),
    D17(17, "img/17.png"),
    D18(18, "img/18.png"),
    D19(19, "img/19.png"),
    D20(20, "img/20.png"),
    D21(21, "img/21.png"),
    D22(22, "img/22.png"),
    D23(23, "img/23.png"),
    D24(24, "img/24.png");

    public final int orderNumber;
    public final String imageUrl;

}
