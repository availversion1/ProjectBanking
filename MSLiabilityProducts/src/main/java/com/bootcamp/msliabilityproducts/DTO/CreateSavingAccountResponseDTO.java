package com.bootcamp.msliabilityproducts.DTO;

import com.bootcamp.msliabilityproducts.Documents.SavingAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSavingAccountResponseDTO implements Serializable {
   private String message;
   private SavingAccount savingAccount;


}
