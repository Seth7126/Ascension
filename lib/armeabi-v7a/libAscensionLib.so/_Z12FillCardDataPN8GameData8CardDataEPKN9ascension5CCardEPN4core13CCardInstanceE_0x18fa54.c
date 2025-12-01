// 函数: _Z12FillCardDataPN8GameData8CardDataEPKN9ascension5CCardEPN4core13CCardInstanceE
// 地址: 0x18fa54
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
char var_a8[0x80]
ascension::BuildCardNameLocalizationKey(&var_a8, 0x80, arg2 + 4)
int16_t r1 = 0

if (arg3 != 0)
    r1 = *(arg3 + 8)

int32_t r0_2 = 0
*arg1 = r1
*(arg1 + 0x14) = *(arg2 + 0x84)
*(arg1 + 2) = (*(arg2 + 0x90)).w
*(arg1 + 4) = (*(arg2 + 0x94)).w
int32_t r1_4 = *(arg2 + 0x88)
*(arg1 + 6) = r1_4.w
int32_t r2_1 = *(arg2 + 0x8c)
*(arg1 + 0xa) = 0
*(arg1 + 8) = r2_1.w

if (r1_4 == 3 && zx.d(*(arg2 + 0xc5)) != 0)
    r0_2 = 2
    *(arg1 + 0xa) = 2

if (*(arg2 + 0x150) != 0)
    r0_2 |= 0x10
    *(arg1 + 0xa) = r0_2.w

if (*(arg2 + 0x154) != 0)
    r0_2 |= 0x20
    *(arg1 + 0xa) = r0_2.w

if (zx.d(*(arg2 + 0xd1)) != 0)
    r0_2 |= 0x40
    *(arg1 + 0xa) = r0_2.w

if (zx.d(*(arg2 + 0xd2)) != 0)
    r0_2 |= 0x80
    *(arg1 + 0xa) = r0_2.w

if (*(arg2 + 0xdc) != 0)
    r0_2 |= 0x100
    *(arg1 + 0xa) = r0_2.w

if (*(arg2 + 0xe0) != 0)
    r0_2 |= 0x200
    *(arg1 + 0xa) = r0_2.w

int32_t r3_8 = *(arg2 + 0x98)

if (r3_8 s< 1)
    if (r1_4 == 1 && r2_1 != 0 && r3_8 == 0 && *(arg2 + 0xb0) == 0)
        r0_2 |= 0x800
        *(arg1 + 0xa) = r0_2.w
else if (*(arg2 + 0xa0) s>= 1)
    r0_2 |= 0x400
    *(arg1 + 0xa) = r0_2.w

if (zx.d(*(arg2 + 0xd3)) != 0)
    r0_2 |= 0x1000
    *(arg1 + 0xa) = r0_2.w

if (*(arg2 + 0xb4) s>= 1)
    r0_2 |= 0x2000
    *(arg1 + 0xa) = r0_2.w

if (zx.d(*(arg2 + 0xc8)) != 0)
    *(arg1 + 0xa) = r0_2.w | 0x8000

if (arg3 != 0 && r1_4 == 8)
    r3_8 = *(arg3 + 0x14)

*(arg1 + 0xc) = r3_8.w
*(arg1 + 0xe) = (*(arg2 + 0xa0)).w
*(arg1 + 0x10) = (*(arg2 + 0xb0)).w
int16_t r0_6 = -1

if (zx.d(*(arg2 + 0xc4)) == 0)
    r0_6 = (*(arg2 + 0xa4)).w

*(arg1 + 0x12) = r0_6
strcpy(arg1 + 0x18, arg2 + 0x44)
sprintf(arg1 + 0x58, "${CARDNAME_%s}", &var_a8)
strcpy(arg1 + 0x98, arg2 + 0x188)
int32_t r6_1 = 0
*(arg1 + 0xd8) = 0

if (*(arg2 + 0x154) != 0)
    r6_1 = sprintf(arg1 + 0xd8, "Transformed %s", &data_1bfacb)

int32_t r9 = *(arg2 + 0x8c)

if (r9 != 0x1e)
    int32_t r7_1 = 0
    
    if ((r9 & 2) == 0)
        if ((r9 & 4) != 0)
            goto label_18fce0
        
        goto label_18fc6c
    
    r7_1 = 1
    r6_1 += sprintf(arg1 + r6_1 + 0xd8, "%s ", ascension::GetCardFactionAsString(1))
    
    if ((r9 & 4) != 0)
    label_18fce0:
        r6_1 += sprintf(arg1 + r6_1 + 0xd8, "%s ", ascension::GetCardFactionAsString(2))
        r7_1 += 1
        
        if ((r9 & 8) == 0)
            goto label_18fc74
        
        goto label_18fd14
    
label_18fc6c:
    
    if ((r9 & 8) == 0)
    label_18fc74:
        
        if ((r9 & 0x10) != 0)
            goto label_18fd4c
        
        goto label_18fc7c
    
label_18fd14:
    r6_1 += sprintf(arg1 + r6_1 + 0xd8, "%s ", ascension::GetCardFactionAsString(3))
    r7_1 += 1
    bool cond:3_1
    
    if ((r9 & 0x10) == 0)
    label_18fc7c:
        cond:3_1 = r7_1 == 1
        
        if (r7_1 s<= 1)
        label_18fd5c:
            
            if (cond:3_1 && *(arg2 + 0x88) == 3)
                *(arg1 + 0xa) |= 8
        else
            *(arg1 + 0xa) |= 8
    else
    label_18fd4c:
        r6_1 += sprintf(arg1 + r6_1 + 0xd8, "%s ", ascension::GetCardFactionAsString(4))
        cond:3_1 = r7_1 == 0
        
        if (r7_1 + 1 s<= 1)
            goto label_18fd5c
        
        *(arg1 + 0xa) |= 8

if (zx.d(*(arg2 + 0xc5)) != 0)
    r6_1 += sprintf(arg1 + r6_1 + 0xd8, "Trophy %s", &data_1bfacb)

if (zx.d(*(arg2 + 0xd1)) != 0)
    r6_1 += sprintf(arg1 + r6_1 + 0xd8, "Dream %s", &data_1bfacb)

char* s = ascension::CCard::GetCardTypeString()
__aeabi_memcpy(arg1 + r6_1 + 0xd8, s, strlen(s) + 1)

if (*(arg2 + 0x13c) == 0)
    *(arg1 + 0x118) = 0
else
    sprintf(arg1 + 0x118, "${EFFECT_%s}", &var_a8)

void* __offset(GameData::CardData, 0x198) str = arg1 + 0x198
*str = 0
*(str + 0x80) = 0
char* format
int16_t r2_15

if (zx.d(*(arg2 + 0xa8)) == 0 || *(arg2 + 0xac) s< 1)
    if (*(arg2 + 0x140) != 0)
        r2_15 = *(arg1 + 0xa) | 1
        format = "${FATE_%s}"
        goto label_18fe7c
    
    if (zx.d(*(arg2 + 0xc5)) != 0 && *(arg2 + 0x144) != 0)
        sprintf(str, "${TROPHY_%s}", &var_a8)
    else
        if (*(arg2 + 0x148) != 0)
            sprintf(str, "${DAY_%s}", &var_a8)
        
        if (*(arg2 + 0x14c) != 0)
            sprintf(str + 0x80, "${NIGHT_%s}", &var_a8)
else
    r2_15 = *(arg1 + 0xa) | 4
    format = "${ENERGY_%s}"
label_18fe7c:
    *(arg1 + 0xa) = r2_15
    sprintf(str, format, &var_a8)
sprintf(arg1 + 0x298, "${FLAVOR_%s}", &var_a8)
int32_t r0_47 = *__stack_chk_guard

if (r0_47 == r0)
    return r0_47 - r0

__stack_chk_fail()
noreturn
