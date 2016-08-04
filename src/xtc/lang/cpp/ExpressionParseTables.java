/*
 * xtc - The eXTensible Compiler
 * Copyright (C) 2009-2012 New York University
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301,
 * USA.
 */
package xtc.lang.cpp;

public class ExpressionParseTables extends ParseTables {
  protected ExpressionParseTables() {
    super(
          108, // YYFINAL
          534, // YYLAST
          127, // YYNTOKENS
          36, // YYNNTS
          133, // YYNRULES
          166, // YYNSTATES
          2, // YYUNDEFTOK
          381, // YYMAXUTOK
          0, // YYEOF
          -120, // YYPACT_NINF
          -69, // YYTABLE_NINF
          yytranslate_wrapper.yytranslate,
          yytname_wrapper.yytname,
          yytoknum_wrapper.yytoknum,
          yyr1_wrapper.yyr1,
          yyr2_wrapper.yyr2,
          yydefact_wrapper.yydefact,
          yydefgoto_wrapper.yydefgoto,
          yypact_wrapper.yypact,
          yypgoto_wrapper.yypgoto,
          yytable_wrapper.yytable,
          yycheck_wrapper.yycheck,
          yystos_wrapper.yystos);
  }

  public static ExpressionParseTables getInstance() {
    if (ref == null)
        ref = new ExpressionParseTables();		
    return ref;
  }

  public Object clone()	throws CloneNotSupportedException {
    throw new CloneNotSupportedException(); 
  }

  private static ExpressionParseTables ref;

  public static class yytranslate_wrapper {
    public static final int[] yytranslate = {
    0, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
    2, 2, 2, 2, 2, 2, 1, 2, 3, 4,
    5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
    15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
    25, 26, 27, 28, 29, 30, 31, 32, 33, 34,
    35, 36, 37, 38, 39, 40, 41, 42, 43, 44,
    45, 46, 47, 48, 49, 50, 51, 52, 53, 54,
    55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
    65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
    75, 76, 77, 78, 79, 80, 81, 82, 83, 84,
    85, 86, 87, 88, 89, 90, 91, 92, 93, 94,
    95, 96, 97, 98, 99, 100, 101, 102, 103, 104,
    105, 106, 107, 108, 109, 110, 111, 112, 113, 114,
    115, 116, 117, 118, 119, 120, 121, 122, 123, 124,
    125, 126
    };
  }

  public static class yytname_wrapper {
    public static final String[] yytname = {
    "$end",
    "error",
    "$undefined",
    "AUTO",
    "DOUBLE",
    "INT",
    "STRUCT",
    "BREAK",
    "ELSE",
    "LONG",
    "SWITCH",
    "CASE",
    "ENUM",
    "REGISTER",
    "TYPEDEF",
    "CHAR",
    "EXTERN",
    "RETURN",
    "UNION",
    "CONST",
    "FLOAT",
    "SHORT",
    "UNSIGNED",
    "CONTINUE",
    "FOR",
    "SIGNED",
    "VOID",
    "DEFAULT",
    "GOTO",
    "SIZEOF",
    "VOLATILE",
    "DO",
    "IF",
    "STATIC",
    "WHILE",
    "IDENTIFIER",
    "STRINGliteral",
    "FLOATINGconstant",
    "INTEGERconstant",
    "CHARACTERconstant",
    "OCTALconstant",
    "HEXconstant",
    "TYPEDEFname",
    "ARROW",
    "ICR",
    "DECR",
    "LS",
    "RS",
    "LE",
    "GE",
    "EQ",
    "NE",
    "ANDAND",
    "OROR",
    "ELLIPSIS",
    "MULTassign",
    "DIVassign",
    "MODassign",
    "PLUSassign",
    "MINUSassign",
    "LSassign",
    "RSassign",
    "ANDassign",
    "ERassign",
    "ORassign",
    "LPAREN",
    "RPAREN",
    "COMMA",
    "HASH",
    "DHASH",
    "LBRACE",
    "RBRACE",
    "LBRACK",
    "RBRACK",
    "DOT",
    "AND",
    "STAR",
    "PLUS",
    "MINUS",
    "NEGATE",
    "NOT",
    "DIV",
    "MOD",
    "LT",
    "GT",
    "XOR",
    "PIPE",
    "QUESTION",
    "COLON",
    "SEMICOLON",
    "ASSIGN",
    "ASMSYM",
    "_BOOL",
    "_COMPLEX",
    "RESTRICT",
    "__ALIGNOF",
    "__ALIGNOF__",
    "ASM",
    "__ASM",
    "__ASM__",
    "AT",
    "USD",
    "__ATTRIBUTE",
    "__ATTRIBUTE__",
    "__BUILTIN_OFFSETOF",
    "__BUILTIN_TYPES_COMPATIBLE_P",
    "__BUILTIN_VA_ARG",
    "__BUILTIN_VA_LIST",
    "__COMPLEX__",
    "__CONST",
    "__CONST__",
    "__EXTENSION__",
    "INLINE",
    "__INLINE",
    "__INLINE__",
    "__LABEL__",
    "__RESTRICT",
    "__RESTRICT__",
    "__SIGNED",
    "__SIGNED__",
    "__THREAD",
    "TYPEOF",
    "__TYPEOF",
    "__TYPEOF__",
    "__VOLATILE",
    "__VOLATILE__",
    "PPNUM",
    "$accept",
    "ConstantExpression",
    "Constant",
    "IntegerConstant",
    "CharacterConstant",
    "PrimaryExpression",
    "PrimaryIdentifier",
    "UnaryExpression",
    "UnaryMinusExpression",
    "UnaryMinusOp",
    "UnaryPlusExpression",
    "UnaryPlusOp",
    "LogicalNegationExpression",
    "LogicalNegateOp",
    "BitwiseNegationExpression",
    "BitwiseNegateOp",
    "DefinedExpression",
    "DefinedKeyword",
    "CheckDefined",
    "MultiplicativeExpression",
    "AdditiveExpression",
    "ShiftExpression",
    "RelationalExpression",
    "EqualityExpression",
    "BitwiseAndExpression",
    "BitwiseAndOp",
    "BitwiseXorExpression",
    "BitwiseXorOp",
    "BitwiseOrExpression",
    "BitwiseOrOp",
    "LogicalAndExpression",
    "LogicalAndOp",
    "LogicalOrExpression",
    "LogicalOrOp",
    "ConditionalExpression",
    "Word"
    };
  }

  public static class yytoknum_wrapper {
    public static final int[] yytoknum = {
    0, 256, 257, 258, 259, 260, 261, 262, 263, 264,
    265, 266, 267, 268, 269, 270, 271, 272, 273, 274,
    275, 276, 277, 278, 279, 280, 281, 282, 283, 284,
    285, 286, 287, 288, 289, 290, 291, 292, 293, 294,
    295, 296, 297, 298, 299, 300, 301, 302, 303, 304,
    305, 306, 307, 308, 309, 310, 311, 312, 313, 314,
    315, 316, 317, 318, 319, 320, 321, 322, 323, 324,
    325, 326, 327, 328, 329, 330, 331, 332, 333, 334,
    335, 336, 337, 338, 339, 340, 341, 342, 343, 344,
    345, 346, 347, 348, 349, 350, 351, 352, 353, 354,
    355, 356, 357, 358, 359, 360, 361, 362, 363, 364,
    365, 366, 367, 368, 369, 370, 371, 372, 373, 374,
    375, 376, 377, 378, 379, 380, 381
    };
  }

  public static class yyr1_wrapper {
    public static final int[] yyr1 = {
    0, 127, 128, 129, 129, 130, 130, 130, 130, 131,
    132, 132, 132, 133, 134, 134, 134, 134, 134, 134,
    135, 136, 137, 138, 139, 140, 141, 142, 143, 143,
    144, 145, 146, 146, 146, 146, 147, 147, 147, 148,
    148, 148, 149, 149, 149, 149, 149, 150, 150, 150,
    151, 151, 152, 153, 153, 154, 155, 155, 156, 157,
    157, 158, 159, 159, 160, 161, 161, 161, 162, 162,
    162, 162, 162, 162, 162, 162, 162, 162, 162, 162,
    162, 162, 162, 162, 162, 162, 162, 162, 162, 162,
    162, 162, 162, 162, 162, 162, 162, 162, 162, 162,
    162, 162, 162, 162, 162, 162, 162, 162, 162, 162,
    162, 162, 162, 162, 162, 162, 162, 162, 162, 162,
    162, 162, 162, 162, 162, 162, 162, 162, 162, 162,
    162, 162, 162, 162
    };
  }

  public static class yyr2_wrapper {
    public static final int[] yyr2 = {
    0, 2, 1, 1, 1, 1, 1, 1, 1, 1,
    1, 1, 3, 1, 1, 1, 1, 1, 1, 1,
    2, 1, 2, 1, 2, 1, 2, 1, 4, 2,
    2, 0, 1, 3, 3, 3, 1, 3, 3, 1,
    3, 3, 1, 3, 3, 3, 3, 1, 3, 3,
    1, 3, 1, 1, 3, 1, 1, 3, 1, 1,
    3, 1, 1, 3, 1, 1, 5, 4, 1, 1,
    1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
    1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
    1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
    1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
    1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
    1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
    1, 1, 1, 1
    };
  }

  public static class yydefact_wrapper {
    public static final int[] yydefact = {
    0, 69, 70, 71, 72, 73, 74, 75, 76, 77,
    78, 79, 80, 81, 82, 83, 84, 85, 86, 87,
    88, 89, 90, 91, 92, 93, 94, 95, 96, 97,
    98, 99, 100, 31, 5, 6, 9, 7, 8, 0,
    23, 21, 27, 25, 101, 102, 103, 104, 105, 106,
    107, 108, 109, 110, 111, 112, 113, 114, 115, 116,
    117, 118, 119, 120, 121, 122, 123, 124, 125, 126,
    127, 128, 129, 130, 131, 132, 133, 0, 11, 3,
    4, 14, 10, 32, 15, 0, 16, 0, 17, 0,
    18, 0, 19, 0, 36, 39, 42, 47, 50, 53,
    56, 59, 62, 65, 2, 13, 30, 0, 1, 20,
    22, 24, 26, 68, 0, 29, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0, 0, 52,
    0, 55, 0, 58, 0, 61, 0, 64, 0, 0,
    12, 0, 33, 34, 35, 37, 38, 40, 41, 45,
    46, 43, 44, 48, 49, 51, 54, 57, 60, 0,
    0, 63, 28, 67, 0, 66
    };
  }

  public static class yydefgoto_wrapper {
    public static final int[] yydefgoto = {
    -1, 77, 78, 79, 80, 81, 82, 83, 84, 85,
    86, 87, 88, 89, 90, 91, 92, 93, 106, 94,
    95, 96, 97, 98, 99, 130, 100, 132, 101, 134,
    102, 136, 103, 139, 104, 105
    };
  }

  public static class yypact_wrapper {
    public static final int[] yypact = {
    120, -120, -120, -120, -120, -120, -120, -120, -120, -120,
    -120, -120, -120, -120, -120, -120, -120, -120, -120, -120,
    -120, -120, -120, -120, -120, -120, -120, -120, -120, -120,
    -120, -120, -120, 446, -120, -120, -120, -120, -120, 120,
    -120, -120, -120, -120, -120, -120, -120, -120, -120, -120,
    -120, -120, -120, -120, -120, -120, -120, -120, -120, -120,
    -120, -120, -120, -120, -120, -120, -120, -120, -120, -120,
    -120, -120, -120, -120, -120, -120, -120, 42, -120, -120,
    -120, -120, -120, -120, -120, 120, -120, 120, -120, 120,
    -120, 120, -120, 243, -35, -19, 22, -5, 20, -27,
    -33, -32, -2, -20, -120, -120, -120, -10, -120, -120,
    -120, -120, -120, -120, 366, -120, 120, 120, 120, 120,
    120, 120, 120, 120, 120, 120, 120, 120, 120, -120,
    120, -120, 120, -120, 120, -120, 120, -120, -3, 120,
    -120, 31, -120, -120, -120, -35, -35, -19, -19, 22,
    22, 22, 22, -5, -5, 20, -27, -33, -32, 120,
    10, -2, -120, -120, 120, -120
    };
  }

  public static class yypgoto_wrapper {
    public static final int[] yypgoto = {
    -120, 18, -120, -120, -120, -120, -54, -36, -120, -120,
    -120, -120, -120, -120, -120, -120, -120, -120, -120, -47,
    -38, -60, -41, -69, 30, -120, 29, -120, 28, -120,
    26, -120, -120, -120, -119, -120
    };
  }

  public static class yytable_wrapper {
    public static final int[] yytable = {
    1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
    11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
    21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
    31, 32, 33, 137, 34, 35, 36, 37, 38, 115,
    163, 116, 108, 123, 124, 165, 117, 118, 129, 109,
    135, 110, 131, 111, 133, 112, 140, 107, 119, 120,
    141, 155, 39, 149, 150, 151, 152, 138, 121, 122,
    127, 128, 145, 146, 40, 41, 42, 43, 125, 126,
    142, 143, 144, 147, 148, 159, 153, 154, 44, 45,
    46, 47, 48, 49, 50, 51, 52, 162, 164, 53,
    54, 55, 56, 57, 58, 59, 60, 61, 62, 63,
    64, 65, 66, 67, 68, 69, 70, 71, 72, 73,
    74, 75, 76, 1, 2, 3, 4, 5, 6, 7,
    8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
    18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
    28, 29, 30, 31, 32, 33, 160, 34, 35, 36,
    37, 38, 156, 157, 158, 161, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 39, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 40, 41, 42,
    43, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    0, 44, 45, 46, 47, 48, 49, 50, 51, 52,
    0, 0, 53, 54, 55, 56, 57, 58, 59, 60,
    61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
    71, 72, 73, 74, 75, 76, 1, 2, 3, 4,
    5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
    15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
    25, 26, 27, 28, 29, 30, 31, 32, 113, 0,
    0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0, 114, 0,
    0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 44, 45, 46, 47, 48, 49,
    50, 51, 52, 0, 0, 53, 54, 55, 56, 57,
    58, 59, 60, 61, 62, 63, 64, 65, 66, 67,
    68, 69, 70, 71, 72, 73, 74, 75, 76, 1,
    2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
    12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
    22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
    32, 113, 0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, -68, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 44, 45, 46,
    47, 48, 49, 50, 51, 52, 0, 0, 53, 54,
    55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
    65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
    75, 76, -68, -68, -68, -68, -68, -68, -68, -68,
    0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, -68, 0, 0, 0, 0, 0, 0, 0,
    0, -68, -68, -68, -68, 0, 0, -68, -68, -68,
    -68, -68, -68, -68, -68
    };
  }

  public static class yycheck_wrapper {
    public static final int[] yycheck = {
    3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
    13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
    23, 24, 25, 26, 27, 28, 29, 30, 31, 32,
    33, 34, 35, 53, 37, 38, 39, 40, 41, 93,
    159, 76, 0, 48, 49, 164, 81, 82, 75, 85,
    52, 87, 85, 89, 86, 91, 66, 39, 77, 78,
    114, 130, 65, 123, 124, 125, 126, 87, 46, 47,
    50, 51, 119, 120, 77, 78, 79, 80, 83, 84,
    116, 117, 118, 121, 122, 88, 127, 128, 91, 92,
    93, 94, 95, 96, 97, 98, 99, 66, 88, 102,
    103, 104, 105, 106, 107, 108, 109, 110, 111, 112,
    113, 114, 115, 116, 117, 118, 119, 120, 121, 122,
    123, 124, 125, 3, 4, 5, 6, 7, 8, 9,
    10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
    20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
    30, 31, 32, 33, 34, 35, 138, 37, 38, 39,
    40, 41, 132, 134, 136, 139, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, 65, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, 77, 78, 79,
    80, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, 91, 92, 93, 94, 95, 96, 97, 98, 99,
    -1, -1, 102, 103, 104, 105, 106, 107, 108, 109,
    110, 111, 112, 113, 114, 115, 116, 117, 118, 119,
    120, 121, 122, 123, 124, 125, 3, 4, 5, 6,
    7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
    17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
    27, 28, 29, 30, 31, 32, 33, 34, 35, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, 65, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, 91, 92, 93, 94, 95, 96,
    97, 98, 99, -1, -1, 102, 103, 104, 105, 106,
    107, 108, 109, 110, 111, 112, 113, 114, 115, 116,
    117, 118, 119, 120, 121, 122, 123, 124, 125, 3,
    4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
    14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
    24, 25, 26, 27, 28, 29, 30, 31, 32, 33,
    34, 35, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, 0, -1, -1, -1,
    -1, -1, -1, -1, -1, -1, -1, 91, 92, 93,
    94, 95, 96, 97, 98, 99, -1, -1, 102, 103,
    104, 105, 106, 107, 108, 109, 110, 111, 112, 113,
    114, 115, 116, 117, 118, 119, 120, 121, 122, 123,
    124, 125, 46, 47, 48, 49, 50, 51, 52, 53,
    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    -1, -1, 66, -1, -1, -1, -1, -1, -1, -1,
    -1, 75, 76, 77, 78, -1, -1, 81, 82, 83,
    84, 85, 86, 87, 88
    };
  }

  public static class yystos_wrapper {
    public static final int[] yystos = {
    0, 3, 4, 5, 6, 7, 8, 9, 10, 11,
    12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
    22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
    32, 33, 34, 35, 37, 38, 39, 40, 41, 65,
    77, 78, 79, 80, 91, 92, 93, 94, 95, 96,
    97, 98, 99, 102, 103, 104, 105, 106, 107, 108,
    109, 110, 111, 112, 113, 114, 115, 116, 117, 118,
    119, 120, 121, 122, 123, 124, 125, 128, 129, 130,
    131, 132, 133, 134, 135, 136, 137, 138, 139, 140,
    141, 142, 143, 144, 146, 147, 148, 149, 150, 151,
    153, 155, 157, 159, 161, 162, 145, 128, 0, 134,
    134, 134, 134, 35, 65, 133, 76, 81, 82, 77,
    78, 46, 47, 48, 49, 83, 84, 50, 51, 75,
    152, 85, 154, 86, 156, 52, 158, 53, 87, 160,
    66, 133, 134, 134, 134, 146, 146, 147, 147, 148,
    148, 148, 148, 149, 149, 150, 151, 153, 155, 88,
    128, 157, 66, 161, 88, 161
    };
  }

}