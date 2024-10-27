package com.example.pricecomparisonsite.model.APIResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseDto {

    String routeCode;	// string	노선코드
    String serviceAreaCode; //	string	영업부대시설코드
    String routeName; //	string	노선명
    String direction; //	string	방향
    String oilCompany; //	string	정유사
    String lpgYn; //	string	LPG여부
    String serviceAreaName; //	string	휴게소/주유소명
    String telNo; //	string	전화번호
    String gasolinePrice; //	string	휘발유가격
    String diselPrice; //	string	경유가격
    String lpgPrice; //	string	LPG가격
    String numOfRows; //	string	한 페이지당 출력건수
    String pageNo; //	string	출력 페이지번호
    String serviceAreaCode2; //	string	휴게소/주유소코드
    String svarAddr; //	string	휴게소주소
    String pageSize; //	string	전체 페이지 수
    String code; //	string	결과
    String message; //	string	결과 메시지
    String count;//	string	전체 결과 수

    public static String success(String res) {
        return res;
    }
}
