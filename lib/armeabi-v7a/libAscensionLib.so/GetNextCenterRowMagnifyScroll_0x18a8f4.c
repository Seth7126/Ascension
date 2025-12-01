// 函数: GetNextCenterRowMagnifyScroll
// 地址: 0x18a8f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0 = *s_pWorldData
int32_t r10

if (r0 == 0)
    r10 = 0
else
    r10 = *(r0 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)

uint32_t result = 0
int32_t* r0_3 = ascension::CWorld::GetCenterRowCardStackList(r10)
int32_t* r8 = r0_3
int32_t r0_4 = *r0_3
int32_t r1_3 = r8[1] - r0_4
int32_t r4_1

if (r1_3 s> 0)
    while (zx.d(*(*(r0_4 + (result << 3)) + 8)) != zx.d(arg1))
        result += 1
        
        if (result s>= r1_3 s>> 3)
            goto label_18a990
    
    r4_1 = 0
    goto label_18ab88

label_18a990:
int32_t* r0_6 = ascension::CWorld::GetCenterRowCardStackList(r10)
r8 = r0_6
int32_t r0_7 = *r0_6
int32_t r1_7 = r8[1] - r0_7

if (r1_7 s> 0)
    result = 0
    
    while (zx.d(*(*(r0_7 + (result << 3)) + 8)) != zx.d(arg1))
        result += 1
        
        if (result s>= r1_7 s>> 3)
            goto label_18a9dc
    
    r4_1 = 1
    goto label_18ab88

label_18a9dc:
int32_t* r0_9 = ascension::CWorld::GetCenterRowCardStackList(r10)
r8 = r0_9
int32_t r0_10 = *r0_9
int32_t r1_11 = r8[1] - r0_10

if (r1_11 s>= 1)
    result = 0
    
    while (zx.d(*(*(r0_10 + (result << 3)) + 8)) != zx.d(arg1))
        result += 1
        
        if (result s>= r1_11 s>> 3)
            goto label_18aa28
    
    r4_1 = 2
    goto label_18ab88

label_18aa28:
int32_t* r0_12 = ascension::CWorld::GetCenterRowCardStackList(r10)
r8 = r0_12
int32_t r0_13 = *r0_12
int32_t r1_15 = r8[1] - r0_13

if (r1_15 s>= 1)
    result = 0
    
    while (zx.d(*(*(r0_13 + (result << 3)) + 8)) != zx.d(arg1))
        result += 1
        
        if (result s>= r1_15 s>> 3)
            goto label_18aa74
    
    r4_1 = 3
    goto label_18ab88

label_18aa74:
int32_t* r0_15 = ascension::CWorld::GetCenterRowCardStackList(r10)
r8 = r0_15
int32_t r0_16 = *r0_15
int32_t r1_19 = r8[1] - r0_16

if (r1_19 s>= 1)
    result = 0
    
    while (zx.d(*(*(r0_16 + (result << 3)) + 8)) != zx.d(arg1))
        result += 1
        
        if (result s>= r1_19 s>> 3)
            goto label_18aac0
    
    r4_1 = 4
    goto label_18ab88

label_18aac0:
int32_t* r0_18 = ascension::CWorld::GetCenterRowCardStackList(r10)
r8 = r0_18
int32_t r0_19 = *r0_18
int32_t r1_23 = r8[1] - r0_19

if (r1_23 s>= 1)
    result = 0
    
    while (zx.d(*(*(r0_19 + (result << 3)) + 8)) != zx.d(arg1))
        result += 1
        
        if (result s>= r1_23 s>> 3)
            goto label_18ab0c
    
    r4_1 = 5
    goto label_18ab88

label_18ab0c:
int32_t* r0_21 = ascension::CWorld::GetCenterRowCardStackList(r10)
r8 = r0_21
int32_t r0_22 = *r0_21
int32_t r1_27 = r8[1] - r0_22

if (r1_27 s>= 1)
    result = 0
    
    while (zx.d(*(*(r0_22 + (result << 3)) + 8)) != zx.d(arg1))
        result += 1
        
        if (result s>= r1_27 s>> 3)
            return 0
    
    r4_1 = 6
label_18ab88:
    void* r5_1 = nullptr
    int32_t var_28_1 = r10
    
    while (true)
        if (arg2 == 0)
            void* r6_2 = &r8[1]
            
            if (r4_1 s>= 1 && result + 1 s>= (*r6_2 - *r8) s>> 3)
                int32_t* r0_32 = ascension::CWorld::GetCenterRowCardStackList(r10)
                
                if (r0_32[1] != *r0_32
                        && *(*ascension::CWorld::GetCenterRowCardStackList(r10) + 4) == 2)
                    int32_t* r0_39 = ascension::CWorld::GetCenterRowCardStackList(r10)
                    r6_2 = &r0_39[1]
                    r8 = r0_39
                    result = 0
                    r4_1 -= 1
            
            result += 1
            
            if (result s>= (*r6_2 - *r8) s>> 3)
                result = 0
                
                if (r4_1 s< 1)
                    return result
                
                r4_1 -= 1
            
            r10 = var_28_1
        else if (result s< 1)
        label_18abc0:
            
            if (r4_1 s> 5)
                break
            
            r4_1 += 1
            int32_t* r0_25 = ascension::CWorld::GetCenterRowCardStackList(r10)
            result = 0xffffffff + ((r0_25[1] - *r0_25) s>> 3)
        else if (*(*r8 + ((result - 1) << 3) + 4) != 2)
            result -= 1
        else
            if (result s<= 1)
                goto label_18abc0
            
            result -= 2
        
        int32_t* r0_43 = ascension::CWorld::GetCenterRowCardStackList(r10)
        void* r0_44 = nullptr
        
        if (r0_43[1] != *r0_43)
            r5_1 = *(*ascension::CWorld::GetCenterRowCardStackList(r10) + (result << 3))
            r0_44 = r5_1
        
        if (r0_44 != 0)
            return zx.d(*(r5_1 + 8))

return 0
