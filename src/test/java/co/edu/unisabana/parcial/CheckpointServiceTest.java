package co.edu.unisabana.parcial;

import co.edu.unisabana.parcial.controller.dto.CheckpointDTO;
import co.edu.unisabana.parcial.service.CheckpointService;
import co.edu.unisabana.parcial.service.port.CheckpointPort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CheckpointServiceTest {

    @InjectMocks
    CheckpointService checkpointService;

    @Mock
    CheckpointPort checkpointPort;

    @Test
    void Given_day_of_moth_greater_than_30_When_invoke_checkin_Then_IllegalArgumentException(){
        CheckpointDTO checkpointDTO = new CheckpointDTO("prueba", "prueba", 31);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            checkpointService.checkin(checkpointDTO);
        });
    }
}
