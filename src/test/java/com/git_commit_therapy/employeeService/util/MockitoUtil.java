package com.git_commit_therapy.employeeService.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import lombok.val;
import org.mockito.MockitoAnnotations;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class MockitoUtil {

    @SneakyThrows
    public static void startMock(Object classToStartMock) {
        try (val closeable = MockitoAnnotations.openMocks(classToStartMock)) {}
    }
}
