// 函数: _ZN14ascensionrules18CanAcquireFromVoidEPN9ascension7CPlayerENS0_9ECardTypeENS0_12ECardFactionE
// 地址: 0x123630
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r5 = arg2
int32_t r0 = *__stack_chk_guard
ascension::CEvent* r7 = *(arg1 + 4)
int32_t r0_2 = *(*(r7 + 0xa4c) + 0x18)
int32_t result

if (r0_2 s< 1)
    result = 0
else
    int32_t r1 = *(arg1 + 0x8c)
    int32_t r10_1 = arg3
    int32_t r1_1 = *(r7 + 0xb40)
    int32_t r1_2 = *(r7 + 0xb44)
    int32_t r1_3 = *(r7 + 0xb48)
    uint32_t r0_3
    int32_t r1_4
    r1_4:r0_3 = mulu.dp.d(r0_2, 0x44)
    
    if (r1_4 != 0)
        r1_4 = 1
    
    if (r1_4 != 0)
        r0_3 = 0xffffffff
    
    void* r0_4 = operator new[](r0_3)
    int32_t var_7c_1 = 6
    int32_t var_78_1 = 0
    void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_80 =
        _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
    ascension::CPlayer* var_34_1 = arg1
    int32_t var_30_1 = 0
    void* var_2c_1 = r0_4
    void* r0_5 = *(r7 + 0xa4c)
    int32_t* i = *(r0_5 + 0xc)
    
    if (i != *(r0_5 + 0x10))
        do
            int32_t r6_1 = *i
            
            if (r6_1 != 0)
                int32_t r0_8 = *(*(r6_1 + 0xc) + 0x88)
                
                if (r0_8 != 3)
                    int32_t temp0_1 = 0
                    uint32_t j = r5
                    
                    while (j != 0)
                        j u>>= 1
                        temp0_1 += 1
                    
                    int32_t temp0_2 = 0
                    uint32_t j_1 = r0_8 - r5
                    
                    while (j_1 != 0)
                        j_1 u>>= 1
                        temp0_2 += 1
                    
                    if (((0x20 - temp0_1) u>> 5 | (0x20 - temp0_2) u>> 5) != 0)
                        int32_t r0_16
                        
                        if (r10_1 != 0)
                            r0_16 = ascension::CWorld::QueryCardFaction(r7, arg1, r6_1)
                        
                        if (r10_1 == 0 || r0_16 != 0)
                            ascension::CEventQueryCardAcquireAttributes::AddQueryCard(&var_80, 
                                r6_1, 9)
            
            i = &i[1]
        while (i != *(*(r7 + 0xa4c) + 0x10))
    
    void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8)* var_a4_1 = &var_80
    ascension::CWorld::HandleQuery(r7)
    
    if (var_30_1 s>= 1)
        int32_t r3_3 = 0
        int32_t* r1_11 = r0_4 + 0xc
        
        do
            r3_3 += 1
            
            if (*r1_11 s<= 0xffffffff)
                *r1_11 = 0
            
            r1_11 = &r1_11[0x11]
        while (r3_3 s< var_30_1)
    
    void* r0_20 = *(r7 + 0xa4c)
    int32_t* r9_1 = *(r0_20 + 0xc)
    
    if (r9_1 == *(r0_20 + 0x10))
    label_1239c8:
        result = 0
    else
        int32_t var_84_1 = 0
        int32_t var_a0_1 = r10_1
        
        while (true)
            void* r6_3 = *r9_1
            
            if (r6_3 != 0)
                void* r4_1 = *(r6_3 + 0xc)
                int32_t r2_2 = *(r4_1 + 0x88)
                
                if (r2_2 != 3)
                    int32_t temp0_3 = 0
                    uint32_t i_1 = r5
                    
                    while (i_1 != 0)
                        i_1 u>>= 1
                        temp0_3 += 1
                    
                    int32_t temp0_4 = 0
                    uint32_t i_2 = r2_2 - r5
                    
                    while (i_2 != 0)
                        i_2 u>>= 1
                        temp0_4 += 1
                    
                    if (((0x20 - temp0_3) u>> 5 | (0x20 - temp0_4) u>> 5) != 0)
                        if (r10_1 == 0)
                            goto label_123824
                        
                        if (ascension::CWorld::QueryCardFaction(r7, arg1, r6_3) != 0)
                            r2_2 = *(r4_1 + 0x88)
                        label_123824:
                            void* r1_14 = r0_4 + var_84_1 * 0x44
                            int32_t r0_26 = *(r4_1 + 0xa0)
                            int32_t r12_1 = *(r1_14 + 0xc)
                            uint32_t r8_1 = zx.d(*(r1_14 + 0x18))
                            
                            if (r2_2 == 1 && zx.d(*(r7 + 0xb2c)) != 0)
                                int32_t r1_17 = *(r4_1 + 0xa4) + r12_1 - *(r1_14 + 8)
                                
                                if (r12_1 s> r1_17)
                                    r12_1 = r1_17 & not.d(r1_17 s>> 0x1f)
                                    r0_26 = 0
                            
                            int32_t r3_7 = r1_1
                            var_84_1 += 1
                            int32_t r1_20 = *(r7 + 0x30)
                            
                            if (r1_20 u< 0x18)
                            label_123928:
                                result = 1
                                
                                if (r12_1 s<= r3_7)
                                    break
                                
                                bool cond:2_1 = r2_2 u> 2
                                
                                if (r2_2 != 2)
                                    cond:2_1 = r1_20 u> 0x17
                                
                                if (not(cond:2_1) && r12_1 s<= r3_7 + r1_2
                                        && ascension::CWorld::QueryCardFaction(r7, arg1, r6_3)
                                        != 0)
                                    break
                            else
                                r3_7 = r1_1
                                int32_t lr_1 = r1_3
                                
                                if (r0_26 s< 1)
                                    goto label_1238e0
                                
                                if (r1_3 s>= r0_26)
                                    lr_1 = r1_3 - r0_26
                                label_1238d0:
                                    r3_7 = r1_1
                                label_1238e0:
                                    
                                    if (r8_1 != 0 || zx.d(*(r4_1 + 0xd5)) != 0)
                                        r3_7 += lr_1
                                    else if (zx.d(*(r7 + 0xb2b)) != 0)
                                        r3_7 += lr_1
                                    
                                    if (zx.d(*(r4_1 + 0xd6)) == 0)
                                        goto label_123928
                                    
                                    r3_7 += r1
                                    
                                    if (zx.d(*(r7 + 0xb3d)) != 0
                                            && (zx.d(*(r4_1 + 0xd5)) | r8_1) == 0
                                            && zx.d(*(r7 + 0xb2b)) == 0)
                                        r3_7 += lr_1
                                    
                                    r10_1 = var_a0_1
                                    goto label_123928
                                
                                int32_t r0_27 = r0_26 - r1_3
                                lr_1 = 0
                                
                                if (r0_27 s< 1)
                                    goto label_1238d0
                                
                                if (r1_1 s>= r0_27 && zx.d(*(r7 + 0xb29)) != 0)
                                    r3_7 = r1_1 - r0_27
                                    goto label_1238e0
            
            r9_1 = &r9_1[1]
            
            if (r9_1 == *(*(r7 + 0xa4c) + 0x10))
                goto label_1239c8
    
    operator delete[](r0_4)
    ascension::CEvent::~CEvent()

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
