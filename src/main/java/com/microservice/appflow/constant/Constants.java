/*
 * Copyright (c) 2022, Bancoppel All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modifications are not
 * permitted.
 *
 * Bancoppel claims copyright in this computer program as an unpublished work.
 *
 * This program is a confidential trade secret and the property of Bancoppel.
 *
 * Use, examination, reproduction, disassembly, decompiling, transfer and/or disclosure to others of
 * all or any part of this software program are strictly prohibited except by express written
 * agreement with Bancoppel.
 *
 * This software is provided by the copyright holders and contributors "as is" and any express or
 * implied warranties, including, but not limited to, the implied warranties of merchantability and
 * fitness for a particular purpose are disclaimed. In no event shall the copyright owner or
 * contributors be liable for any direct, indirect, incidental, special, exemplary, or consequential
 * damages (including, but not limited to, procurement of substitute goods or services; Loss of use,
 * data, or profits; Or business interruption) however caused and on any theory of liability,
 * whether in contract, strict liability, or tort (including negligence or otherwise) arising in any
 * way out of the use of this software, even if advised of the possibility of such damage.
 *
 * Developed by Bancoppel.
 */

package com.microservice.appflow.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Clase de constantes generales de la aplicacion.
 *
 * @author Nova Solution Systems.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constants {

  /**
   * Constante que contiene el valor del base path.
   */
  public static final String BASE_PATH = "${api.uri.basePath}";

  /**
   * Constante que indica si se imprimiran headers o no.
   */
  public static final String PRINT_HEADERS = "${api.headers.print}";

  /**
   * Constante que contiene la cadena "OK".
   */
  public static final String OK = "OK";

  /**
   * Constante que representa la cadena "JSON".
   */
  public static final String JSON_STRING = "JSON";

  /**
   * Constante que representa la cadena "N".
   */
  public static final String N = "N";

  /**
   * Constante que representa la cadena "Y".
   */
  public static final String Y = "Y";

  /**
   * Constante usada como llave para el atributo uuid header.
   */
  public static final String UUID_MDC_LABEL = "mdc.uuid";

  /**
   * Constante para la llave req.t0 que almacenara el momento de inicio de la peticion.
   */
  public static final String T0_REQ_ATTRIBUTE = "req.t0";

  /**
   * Constante del mensaje de estatus de la peticion.
   */
  public static final String MSG_STATUS = "status";

  /**
   * Constante del mensaje de la peticion.
   */
  public static final String MSG_REQUEST = "request";

  /**
   * Constante del mensaje de la respuesta.
   */
  public static final String MSG_RESPONSE = "response";

  /**
   * Constante que representa la cadena "type".
   */
  public static final String ERROR_RESPONSE_TYPE = "type";

  /**
   * Constante que representa la cadena "code".
   */
  public static final String ERROR_RESPONSE_CODE = "code";

  /**
   * Constante que representa la cadena "details".
   */
  public static final String ERROR_RESPONSE_DETAILS = "details";

  /**
   * Constante que representa la cadena "location".
   */
  public static final String ERROR_RESPONSE_LOCATION = "location";

  /**
   * Constante que representa la cadena "moreInfo".
   */
  public static final String ERROR_RESPONSE_MORE_INFORMATION = "moreInfo";

  /**
   * Constante que representa la cadena "timestamp".
   */
  public static final String ERROR_RESPONSE_TIMESTAMP = "timestamp";

  /**
   * Constante que representa el nombre de la excepcion DownstreamException.
   */
  public static final String DOWNSTREAMEXCEPTION = "DownstreamException";

  /**
   * Constante que representa el valor de un dato mandatorio.
   */
  public static final boolean REQUIRED = true;
  
  /**
   * Constante que representa el header "uuid".
   */
  public static final String UUID = "uuid";

  /**
   * Constante que representa el header "Content-Type".
   */
  public static final String CONTENT_TYPE = "Content-Type";

  /**
   * Constante que representa el header "Accept".
   */
  public static final String ACCEPT = "Accept";

  /**
   * Constante que representa el header "Authorization".
   */
  public static final String AUTHORIZATION = "Authorization";

  /**
   * Constante que representa el header "deviceId".
   */
  public static final String DEVICE_ID = "deviceId";

  /**
   * Constante que representa el header "client_id".
   */
  public static final String CLIENT_ID = "client_id";

  /**
   * Constante que representa el header "Accept-Language".
   */
  public static final String ACCEPT_LANGUAGE = "Accept-Language";

  /**
   * Constante que representa el header "Host".
   */
  public static final String HOST = "Host";

  /**
   * Constante que representa el header "User-Agent".
   */
  public static final String USER_AGENT = "User-Agent";

  /**
   * Constante que representa el header "Content-Encoding".
   */
  public static final String CONTENT_ENCODING = "Content-Encoding";

  /**
   * Constante que representa el header "Content-Language".
   */
  public static final String CONTENT_LANGUAGE = "Content-Language";

  /**
   * Constante que representa el header "Content-Length".
   */
  public static final String CONTENT_LENGTH = "Content-Length";

  /**
   * Constante que representa el header "Content-MD5".
   */
  public static final String CONTENT_MD5 = "Content-MD5";

  /**
   * Constante que representa el header "Accept-Charset".
   */
  public static final String ACCEPT_CHARSET = "Accept-Charset";

  /**
   * Constante que representa el header "Date".
   */
  public static final String DATE = "Date";

  /**
   * Constante que representa el header "Accept-Encoding".
   */
  public static final String ACCEPT_ENCODING = "Accept-Encoding";

  /**
   * Constante que representa el header "channel_id".
   */
  public static final String CHANNEL_ID = "channel_id";

  /**
   * Constante utilizada para mostrar un mensaje acerca de una peticion mal formada.
   */
  public static final String BAD_REQUEST = "Bad Request";

  /**
   * Constante utilizada para mostrar un mensaje acerca de una peticion no autorizada.
   */
  public static final String UNAUTHORIZED = "Unauthorized";

  /**
   * Constante utilizada para mostrar un mensaje acerca de una peticion no autorizada.
   */
  public static final String ACCESS_NOT_CONFIGURED = "Forbidden";

  /**
   * Constante utilizada para mostrar un mensaje acerca de recurso que no pudo ser encontrado.
   */
  public static final String RESOURCE_NOT_FOUND = "Resource not found";

  /**
   * Constante utilizada para mostrar un mensaje acerca de un "Internal server error".
   */
  public static final String INTERNAL_ERROR = "Internal server error";

  /**
   * Constante utilizada para mostrar el status code "200".
   */
  public static final String CODE_OK = "200";
  
  /**
   * Constante utilizada para mostrar el status code "204".
   */
  public static final String CODE_NO_CONTENT = "204";

  /**
   * Constante utilizada para mostrar el status code "400".
   */
  public static final String CODE_BAD_REQUEST = "400";

  /**
   * Constante utilizada para mostrar el status code "401".
   */
  public static final String CODE_UNAUTHORIZED = "401";

  /**
   * Constante utilizada para mostrar el status code "403".
   */
  public static final String CODE_ACCESS_NOT_CONFIGURED = "403";

  /**
   * Constante utilizada para mostrar el status code "404".
   */
  public static final String CODE_RESOURCE_NOT_FOUND = "404";

  /**
   * Constante utilizada para mostrar el status code "408".
   */
  public static final String CODE_RESOURCE_REQUEST_TIMEOUT = "408";

  /**
   * Constante utilizada para mostrar el status code "422".
   */
  public static final String CODE_BUSINESS_VALIDATION_FAILED = "422";

  /**
   * Constante utilizada para mostrar el status code "500".
   */
  public static final String CODE_INTERNAL_ERROR = "500";

  /**
   * Constante que representa el status HTTP por default.
   */
  public static final int DEFAULT_STATUS_HTTP = 0;

  /**
   * Constante utilizada para mostrar el tipo de dato "string".
   */
  public static final String STRING_TYPE = "string";
  
  /**
   * Constante utilizada para mostrar la trazabilidad en el log.
   */
  public static final String BUSINESS_MAIN = "Método principal que obtiene las cuentas";
  public static final String FRONT_DOCUMENT = "front-document";
  public static final String BACK_DOCUMENT = "back-document";
  public static final String CONTENT = "application/json";
  public static final String MESSAGE_INCODE = "No fue posible conectarse al servicio de start onBoarding de incode";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String COUNTRY_ID = "contry_id";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String STATE = "state";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String CITY_COMPLT = "city_complt"; 
  
  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String MPIO_ID = "mpio_id";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String MPIO_COMPLT = "mpio_complt";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String STREET = "street"; 
  
  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String OUT_NUMBER = "out_number";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String ADDRES_TYPE = "addres_type";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String COLONY_ID = "colony_id"; 
  
  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String COD_POSTAL = "cod_postal";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String INT_NUMBER = "int_number";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String DEPTO = "depto"; 
  
  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String BTWN_STREET = "btwn_street";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String COURSE = "course";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String OTHERS = "others";
  
  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String SIDE_WALK = "side_walk";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String STAGE = "stage";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String BILDNG = "bildng";
  
  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String BATCH = "batch";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String BLOCK = "block";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String ENTRY = "entry";
  
  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String HOUSNG_UNID = "housng_unid";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String OBSVTS = "obsvts";

  /**
   * Constante utilizada para obtener valor de la BD .
   */
  public static final String LATITD = "latitd";
  
  /**
  * Constante utilizada para obtener valor de la BD .
  */
 public static final String LONGTD = "longtd";

 /**
  * Constante utilizada para obtener valor de la BD .
  */
 public static final String ID_SESSION = "id_session";
 
 /**
  * Constante utilizada para obtener valor de la BD .
  */
 public static final String DATE_INSERT = "date_insert";

 /**
  * Constante utilizada para obtener valor de la BD .
  */
 public static final String ADDRES_STATUS_MATCH = "addres_status_match";
 
 /**
  * Constante con expresion regular para validar que es una cadena alfanumerica.
  */
 public static final String REGEX_VALIDATE_CHARACTERS = "^[A-Z0-9 Ñ]*$";
 
 /**
  * Constante utilizada para obtener el mensaje FAILED
  */
 public static final String FAILED = "FAILED";
 
 /**
  * Constante utilizada para obtener el mensaje Error General
  */
 public static final String GENERAL_ERROR = "Error General";

 /**
  * Constante utilizada para obtener el mensaje ERROR
  */
 public static final String ERROR = "ERROR";
}
