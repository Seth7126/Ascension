// 函数: sub_da4b0
// 地址: 0xda4b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t result_1
uint32_t result

switch (tolower(arg2) - 0x61)
    case 0
        result_1 = isalpha(arg1)
    label_da5d8:
        result = result_1
    label_da5e0:
        int32_t r0_18 = islower(arg2)
        int32_t temp0_2 = 0
        uint32_t i = result
        
        while (i != 0)
            i u>>= 1
            temp0_2 += 1
        
        if (r0_18 == 0)
            return (0x20 - temp0_2) u>> 5
        
        return result
    case 2
        result_1 = iscntrl(arg1)
        goto label_da5d8
    case 3
        result = 0
        
        if (arg1 - 0x30 u< 0xa)
            result = 1
        
        goto label_da5e0
    case 6
        result_1 = isgraph(arg1)
        goto label_da5d8
    case 0xb
        result_1 = islower(arg1)
        goto label_da5d8
    case 0xf
        result_1 = ispunct(arg1)
        goto label_da5d8
    case 0x12
        result_1 = isspace(arg1)
        goto label_da5d8
    case 0x14
        result_1 = isupper(arg1)
        goto label_da5d8
    case 0x16
        result_1 = isalnum(arg1, &jump_table_da4e0)
        goto label_da5d8
    case 0x17
        result_1 = isxdigit(arg1)
        goto label_da5d8
    case 0x19
        int32_t temp0_3 = 0
        int32_t i_1 = arg1
        
        while (i_1 != 0)
            i_1 u>>= 1
            temp0_3 += 1
        
        result = (0x20 - temp0_3) u>> 5
        goto label_da5e0

int32_t temp0_1 = 0
int32_t i_2 = arg2 - arg1

while (i_2 != 0)
    i_2 u>>= 1
    temp0_1 += 1

return (0x20 - temp0_1) u>> 5
