package com.cg.spblaguna.model.dto.req;

import com.cg.spblaguna.model.enumeration.ERoomType;
import com.cg.spblaguna.model.enumeration.EStatusRoom;
import com.cg.spblaguna.model.enumeration.EViewType;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoomReqDTO {
    private Long id;

    @NotBlank
    @Length(min = 5)
    private String name;

    private ERoomType roomType;

    private EStatusRoom statusRoom;

    private EViewType viewType;

    private Long kindOfRoomId;

    private Long perTypId;

    private BigDecimal pricePerNight;

    private BigDecimal acreage;

    private Integer sleep;

    private String description;

    private String utilitie;

    List<String> imageIds;

}
