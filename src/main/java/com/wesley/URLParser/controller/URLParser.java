package com.wesley.URLParser.controller;

import java.util.Map;

import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import com.wesley.URLParser.model.URLFieldsModel;
import com.wesley.URLParser.model.URLParsedResponseMapperModel;
import com.wesley.URLParser.parsers.QueryArgumentsParser;
import com.wesley.URLParser.parsers.URLParserMethods;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/wesleyurlparser")
public class URLParser {
	
	@Autowired URLParserMethods urlParser;
	
    @GetMapping
    @ApiOperation(value = "Parse the given URL" )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
    })
    public URLParsedResponseMapperModel getParseURL(@ApiParam(name = "url", value = "URL as String") @RequestParam String url){	
    	
    	URLFieldsModel fieldsMap = urlParser.parseAllFields(url);
    	
    	QueryArgumentsParser argsParser = new QueryArgumentsParser();
    	Map<String, String> queryArgValues = argsParser.argumentValueParser(fieldsMap.getArgsQuery());

    	URLParsedResponseMapperModel responseMapper = new URLParsedResponseMapperModel(fieldsMap.toString(), queryArgValues.toString());

    	return responseMapper;
    }
}
