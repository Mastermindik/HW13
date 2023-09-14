package academy.prog.chatserversprint.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FileDTO {
    private String fileName;
    private String fileData;
}
