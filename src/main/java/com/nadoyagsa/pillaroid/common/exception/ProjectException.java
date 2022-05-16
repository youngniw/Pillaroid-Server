package com.nadoyagsa.pillaroid.common.exception;

import com.nadoyagsa.pillaroid.common.exception.ErrorCode;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProjectException extends RuntimeException {
	public static final ProjectException BARCODE_NOT_FOUND = new ProjectException(ErrorCode.BARCODE_NOT_FOUND);
	public static final ProjectException NOT_SUPPORTED_BARCODE_FORMAT = new ProjectException(ErrorCode.NOT_SUPPORTED_BARCODE_FORMAT);

	private final ErrorCode errorCode;

	public ErrorCode getErrorCode() {
		return errorCode;
	}
}