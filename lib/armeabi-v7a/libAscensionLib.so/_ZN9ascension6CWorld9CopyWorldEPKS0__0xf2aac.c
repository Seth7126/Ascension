// 函数: _ZN9ascension6CWorld9CopyWorldEPKS0_
// 地址: 0xf2aac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* entry_r1
int32_t r0_1 = *(entry_r1 + 4)
*(arg1 + 4) = r0_1
*(arg1 + 8) = *(entry_r1 + 8)
*(arg1 + 0xb10) = *(entry_r1 + 0xb10)
*(arg1 + 0xb14) = *(entry_r1 + 0xb14)

if (r0_1 != 0)
    int32_t r7_1 = 0
    int32_t r2_2
    
    do
        int32_t* r6_1 = *(*(entry_r1 + 0xc) + (r7_1 << 2))
        int32_t* r1_4 = *(arg1 + 0xc) + (r7_1 << 2)
        int32_t* r0_3 = *r1_4
        int32_t* var_28_1 = r0_3
        
        if (r6_1 == 0)
            if (r0_3 != 0)
                (*(*r0_3 + 4))()
                r1_4 = *(arg1 + 0xc) + (r7_1 << 2)
            
            *r1_4 = 0
        else if (r0_3 == 0)
            if (r6_1[1] == 0)
                *r1_4 = r6_1
            else
                uint16_t r0_7 = (*(*r6_1 + 8))(r6_1)
                r6_1[2].w
                int32_t r0_9 = ascension::CWorld::CreateInstanceByType(arg1, r0_7)
                int32_t var_28_2 = r0_9
                *(*(arg1 + 0xc) + (r7_1 << 2)) = r0_9
        
        r2_2 = *(arg1 + 4)
        r7_1 += 1
    while (r7_1 u< r2_2)
    
    if (r2_2 != 0)
        int32_t r6_2 = 0
        
        do
            int32_t r1_10 = *(*(entry_r1 + 0xc) + (r6_2 << 2))
            int32_t* r0_12 = *(*(arg1 + 0xc) + (r6_2 << 2))
            int32_t* var_28_3 = r0_12
            
            if (r1_10 != 0)
                (*(*r0_12 + 0x18))(r0_12, r1_10, arg1)
                r2_2 = *(arg1 + 4)
            
            r6_2 += 1
        while (r6_2 u< r2_2)

int32_t r0_13 = *(arg1 + 0x18)
*(arg1 + 0x11) = *(entry_r1 + 0x11)
*(arg1 + 0x1c) = r0_13

for (int32_t* i = *(entry_r1 + 0x18); i != *(entry_r1 + 0x1c); i = &i[1])
    *(*i + 8)
    int32_t r0_17 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_4 = r0_17
    int32_t var_30_1 = r0_17
    int32_t* r1_13 = *(arg1 + 0x1c)
    
    if (r1_13 u>= *(arg1 + 0x20))
        std::__ndk1::vector<core::CPlayerBase*, std::__ndk1::allocator<core::CPlayerBase*> >::__push_back_slow_path<core::CPlayerBase*>(
            arg1 + 0x18)
    else
        *r1_13 = r0_17
        *(arg1 + 0x1c) += 4

*(arg1 + 0xa34) = *(arg1 + 0xa30)

for (int32_t* i_1 = *(entry_r1 + 0xa30); i_1 != *(entry_r1 + 0xa34); i_1 = &i_1[1])
    *(*i_1 + 8)
    int32_t r0_26 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_5 = r0_26
    int32_t var_30_2 = r0_26
    int32_t* r1_15 = *(arg1 + 0xa34)
    
    if (r1_15 == *(arg1 + 0xa38))
        std::__ndk1::vector<ascension::CCardStackUniformAscension*, std::__ndk1::allocator<ascension::CCardStackUniformAscension*> >::__push_back_slow_path<ascension::CCardStackUniformAscension* const&>(
            arg1 + 0xa30)
    else
        *r1_15 = r0_26
        *(arg1 + 0xa34) += 4

*(*(entry_r1 + 0xa3c) + 8)
int32_t r0_33 = core::CWorldBase::GetInstanceByID(arg1)
int32_t var_28_6 = r0_33
*(arg1 + 0xa3c) = r0_33
void* r0_34 = *(entry_r1 + 0xa5c)
int32_t r0_36

if (r0_34 == 0)
    r0_36 = 0
else
    *(r0_34 + 8)
    r0_36 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_7 = r0_36

*(arg1 + 0xa5c) = r0_36
void* r0_37 = *(entry_r1 + 0xa60)
int32_t r0_39

if (r0_37 == 0)
    r0_39 = 0
else
    *(r0_37 + 8)
    r0_39 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_8 = r0_39

*(arg1 + 0xa60) = r0_39
void* r0_40 = *(entry_r1 + 0xa64)
int32_t r0_42

if (r0_40 == 0)
    r0_42 = 0
else
    *(r0_40 + 8)
    r0_42 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_9 = r0_42

*(arg1 + 0xa64) = r0_42
void* r0_43 = *(entry_r1 + 0xa68)
int32_t r0_45

if (r0_43 == 0)
    r0_45 = 0
else
    *(r0_43 + 8)
    r0_45 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_10 = r0_45

*(arg1 + 0xa68) = r0_45
*(arg1 + 0xa44) = *(arg1 + 0xa40)

for (int32_t* i_2 = *(entry_r1 + 0xa40); i_2 != *(entry_r1 + 0xa44); i_2 = &i_2[1])
    *(*i_2 + 8)
    int32_t r0_50 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_11 = r0_50
    int32_t var_30_3 = r0_50
    int32_t* r1_22 = *(arg1 + 0xa44)
    
    if (r1_22 == *(arg1 + 0xa48))
        std::__ndk1::vector<ascension::CCenterRowInstance*, std::__ndk1::allocator<ascension::CCenterRowInstance*> >::__push_back_slow_path<ascension::CCenterRowInstance* const&>(
            arg1 + 0xa40)
    else
        *r1_22 = r0_50
        *(arg1 + 0xa44) += 4

*(*(entry_r1 + 0xa4c) + 8)
int32_t r0_57 = core::CWorldBase::GetInstanceByID(arg1)
int32_t var_28_12 = r0_57
int32_t r1_24 = *(arg1 + 0xa50)
*(arg1 + 0xa4c) = r0_57
*(arg1 + 0xa54) = r1_24

for (int32_t* i_3 = *(entry_r1 + 0xa50); i_3 != *(entry_r1 + 0xa54); i_3 = &i_3[1])
    *(*i_3 + 8)
    int32_t r0_61 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_13 = r0_61
    int32_t var_30_4 = r0_61
    int32_t* r1_26 = *(arg1 + 0xa54)
    
    if (r1_26 == *(arg1 + 0xa58))
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            arg1 + 0xa50)
    else
        *r1_26 = r0_61
        *(arg1 + 0xa54) += 4

*(arg1 + 0xacc) = *(arg1 + 0xac8)

for (int32_t* i_4 = *(entry_r1 + 0xac8); i_4 != *(entry_r1 + 0xacc); i_4 = &i_4[2])
    *(*i_4 + 8)
    int32_t r0_70 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_14 = r0_70
    int32_t* r0_72 = *(arg1 + 0xacc)
    
    if (r0_72 == *(arg1 + 0xad0))
        std::__ndk1::vector<ascension::LifeboundList, std::__ndk1::allocator<ascension::LifeboundList> >::__push_back_slow_path<ascension::LifeboundList const&>(
            arg1 + 0xac8)
    else
        int32_t r2_9 = i_4[1].b.d
        *r0_72 = r0_70
        r0_72[1] = r2_9
        *(arg1 + 0xacc) += 8

int32_t* r0_77 = *(arg1 + 0xad4)
*(arg1 + 0xad8) = r0_77
int32_t* r7_2 = *(entry_r1 + 0xad4)

if (r7_2 != *(entry_r1 + 0xad8))
    while (true)
        if (r0_77 == *(arg1 + 0xadc))
            std::__ndk1::vector<ascension::CCard const*, std::__ndk1::allocator<ascension::CCard const*> >::__push_back_slow_path<ascension::CCard const* const&>(
                arg1 + 0xad4)
        else
            *r0_77 = *r7_2
            *(arg1 + 0xad8) += 4
        
        r7_2 = &r7_2[1]
        
        if (r7_2 == *(entry_r1 + 0xad8))
            break
        
        r0_77 = *(arg1 + 0xad8)

int32_t* r0_82 = *(arg1 + 0xae0)
*(arg1 + 0xae4) = r0_82
int32_t* r7_3 = *(entry_r1 + 0xae0)

if (r7_3 != *(entry_r1 + 0xae4))
    while (true)
        if (r0_82 == *(arg1 + 0xae8))
            std::__ndk1::vector<ascension::CCard const*, std::__ndk1::allocator<ascension::CCard const*> >::__push_back_slow_path<ascension::CCard const* const&>(
                arg1 + 0xae0)
        else
            *r0_82 = *r7_3
            *(arg1 + 0xae4) += 4
        
        r7_3 = &r7_3[1]
        
        if (r7_3 == *(entry_r1 + 0xae4))
            break
        
        r0_82 = *(arg1 + 0xae4)

void* r0_87 = *(entry_r1 + 0xa6c)
int32_t r0_89

if (r0_87 == 0)
    r0_89 = 0
else
    *(r0_87 + 8)
    r0_89 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_15 = r0_89

*(arg1 + 0xa6c) = r0_89
void* r0_90 = *(entry_r1 + 0xa88)
int32_t r0_92

if (r0_90 == 0)
    r0_92 = 0
else
    *(r0_90 + 8)
    r0_92 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_16 = r0_92

*(arg1 + 0xa88) = r0_92
*(arg1 + 0xa74) = *(arg1 + 0xa70)

for (int32_t* i_5 = *(entry_r1 + 0xa70); i_5 != *(entry_r1 + 0xa74); i_5 = &i_5[1])
    *(*i_5 + 8)
    int32_t r0_97 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_30_6 = r0_97
    int32_t* r1_41 = *(arg1 + 0xa74)
    
    if (r1_41 == *(arg1 + 0xa78))
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            arg1 + 0xa70)
    else
        *r1_41 = r0_97
        *(arg1 + 0xa74) += 4

*(arg1 + 0xa80) = *(arg1 + 0xa7c)

for (int32_t* i_6 = *(entry_r1 + 0xa7c); i_6 != *(entry_r1 + 0xa80); i_6 = &i_6[1])
    *(*i_6 + 8)
    int32_t r0_106 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_30_7 = r0_106
    int32_t* r1_43 = *(arg1 + 0xa80)
    
    if (r1_43 == *(arg1 + 0xa84))
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            arg1 + 0xa7c)
    else
        *r1_43 = r0_106
        *(arg1 + 0xa80) += 4

*(arg1 + 0xa90) = *(arg1 + 0xa8c)

for (int32_t* i_7 = *(entry_r1 + 0xa8c); i_7 != *(entry_r1 + 0xa90); i_7 = &i_7[1])
    *(*i_7 + 8)
    int32_t r0_115 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_30_8 = r0_115
    int32_t* r1_45 = *(arg1 + 0xa90)
    
    if (r1_45 == *(arg1 + 0xa94))
        std::__ndk1::vector<ascension::CActiveEffectInstance*, std::__ndk1::allocator<ascension::CActiveEffectInstance*> >::__push_back_slow_path<ascension::CActiveEffectInstance* const&>(
            arg1 + 0xa8c)
    else
        *r1_45 = r0_115
        *(arg1 + 0xa90) += 4

*(arg1 + 0xa9c) = *(arg1 + 0xa98)

for (int32_t* i_8 = *(entry_r1 + 0xa98); i_8 != *(entry_r1 + 0xa9c); i_8 = &i_8[1])
    *(*i_8 + 8)
    int32_t r0_124 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_17 = r0_124
    int32_t* r1_47 = *(arg1 + 0xa9c)
    
    if (r1_47 == *(arg1 + 0xaa0))
        std::__ndk1::vector<core::CInstance*, std::__ndk1::allocator<core::CInstance*> >::__push_back_slow_path<core::CInstance* const&>(
            arg1 + 0xa98)
    else
        *r1_47 = r0_124
        *(arg1 + 0xa9c) += 4

*(arg1 + 0xaa8) = *(arg1 + 0xaa4)

for (int32_t* i_9 = *(entry_r1 + 0xaa4); i_9 != *(entry_r1 + 0xaa8); i_9 = &i_9[1])
    *(*i_9 + 8)
    int32_t r0_133 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_30_9 = r0_133
    int32_t* r1_49 = *(arg1 + 0xaa8)
    
    if (r1_49 == *(arg1 + 0xaac))
        std::__ndk1::vector<ascension::CActiveEffectInstance*, std::__ndk1::allocator<ascension::CActiveEffectInstance*> >::__push_back_slow_path<ascension::CActiveEffectInstance* const&>(
            arg1 + 0xaa4)
    else
        *r1_49 = r0_133
        *(arg1 + 0xaa8) += 4

*(arg1 + 0xab4) = *(arg1 + 0xab0)

for (int32_t* i_10 = *(entry_r1 + 0xab0); i_10 != *(entry_r1 + 0xab4); i_10 = &i_10[1])
    *(*i_10 + 8)
    int32_t r0_142 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_30_10 = r0_142
    int32_t* r1_51 = *(arg1 + 0xab4)
    
    if (r1_51 == *(arg1 + 0xab8))
        std::__ndk1::vector<ascension::CActiveEffectInstance*, std::__ndk1::allocator<ascension::CActiveEffectInstance*> >::__push_back_slow_path<ascension::CActiveEffectInstance* const&>(
            arg1 + 0xab0)
    else
        *r1_51 = r0_142
        *(arg1 + 0xab4) += 4

*(arg1 + 0xac0) = *(arg1 + 0xabc)

for (int32_t* i_11 = *(entry_r1 + 0xabc); i_11 != *(entry_r1 + 0xac0); i_11 = &i_11[1])
    *(*i_11 + 8)
    int32_t r0_151 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_18 = r0_151
    int32_t var_30_11 = r0_151
    int32_t* r1_53 = *(arg1 + 0xac0)
    
    if (r1_53 == *(arg1 + 0xac4))
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            arg1 + 0xabc)
    else
        *r1_53 = r0_151
        *(arg1 + 0xac0) += 4

*(arg1 + 0xb0c) = *(entry_r1 + 0xb0c)
*(arg1 + 0xb18) = *(entry_r1 + 0xb18)
*(arg1 + 0xb1c) = *(entry_r1 + 0xb1c)
void* r0_159 = *(entry_r1 + 0xb20)
int32_t r0_161

if (r0_159 == 0)
    r0_161 = 0
else
    *(r0_159 + 8)
    r0_161 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_19 = r0_161

*(arg1 + 0xb20) = r0_161
void* r0_162 = *(entry_r1 + 0xb24)
int32_t r0_164

if (r0_162 == 0)
    r0_164 = 0
else
    *(r0_162 + 8)
    r0_164 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_20 = r0_164

*(arg1 + 0xb24) = r0_164
*(arg1 + 0xb28) = *(entry_r1 + 0xb28)
*(arg1 + 0xb29) = *(entry_r1 + 0xb29)
*(arg1 + 0xb2a) = *(entry_r1 + 0xb2a)
*(arg1 + 0xb2b) = *(entry_r1 + 0xb2b)
*(arg1 + 0xb2c) = *(entry_r1 + 0xb2c)
*(arg1 + 0xb30) = *(entry_r1 + 0xb30)
*(arg1 + 0xb34) = *(entry_r1 + 0xb34)
*(arg1 + 0xb38) = *(entry_r1 + 0xb38)
*(arg1 + 0xb3c) = *(entry_r1 + 0xb3c)
*(arg1 + 0xb3d) = *(entry_r1 + 0xb3d)
*(arg1 + 0xb40) = *(entry_r1 + 0xb40)
*(arg1 + 0xb44) = *(entry_r1 + 0xb44)
*(arg1 + 0xb48) = *(entry_r1 + 0xb48)
*(arg1 + 0xb4c) = *(entry_r1 + 0xb4c)
*(arg1 + 0xb50) = *(entry_r1 + 0xb50)
*(arg1 + 0xb54) = *(entry_r1 + 0xb54)
*(arg1 + 0xb58) = *(entry_r1 + 0xb58)
*(arg1 + 0xb5c) = *(entry_r1 + 0xb5c)
*(arg1 + 0xb60) = *(entry_r1 + 0xb60)
*(arg1 + 0xb64) = *(entry_r1 + 0xb64)
*(arg1 + 0xb68) = *(entry_r1 + 0xb68)
*(arg1 + 0xb6c) = *(entry_r1 + 0xb6c)
int32_t* r0_187 = *(arg1 + 0xb70)
*(arg1 + 0xb74) = r0_187
int32_t* r7_4 = *(entry_r1 + 0xb70)
char var_2c

if (r7_4 != *(entry_r1 + 0xb74))
    while (true)
        var_2c.d = r7_4[1]
        
        if (r0_187 == *(arg1 + 0xb78))
            std::__ndk1::vector<ascension::ConvertRunesToHonorEvent, std::__ndk1::allocator<ascension::ConvertRunesToHonorEvent> >::__push_back_slow_path<ascension::ConvertRunesToHonorEvent const&>(
                arg1 + 0xb70)
        else
            *r0_187 = *r7_4
            r0_187[1] = var_2c.d
            *(arg1 + 0xb74) += 8
        
        r7_4 = &r7_4[2]
        
        if (r7_4 == *(entry_r1 + 0xb74))
            break
        
        r0_187 = *(arg1 + 0xb74)

int32_t r0_192 = *(arg1 + 0xb80)
*(arg1 + 0xb7c) = *(entry_r1 + 0xb7c)
*(arg1 + 0xb84) = r0_192

for (int32_t* i_12 = *(entry_r1 + 0xb80); i_12 != *(entry_r1 + 0xb84); i_12 = &i_12[2])
    *(*i_12 + 8)
    int32_t r0_196 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_21 = r0_196
    var_2c.d = i_12[1]
    int32_t* r0_198 = *(arg1 + 0xb84)
    
    if (r0_198 == *(arg1 + 0xb88))
        std::__ndk1::vector<ascension::PlayedCardEvent, std::__ndk1::allocator<ascension::PlayedCardEvent> >::__push_back_slow_path<ascension::PlayedCardEvent const&>(
            arg1 + 0xb80)
    else
        *r0_198 = r0_196
        r0_198[1] = var_2c.d
        *(arg1 + 0xb84) += 8

*(*(entry_r1 + 0xb8c) + 8)
int32_t r0_205 = core::CWorldBase::GetInstanceByID(arg1)
int32_t var_28_22 = r0_205
int32_t r1_66 = *(arg1 + 0xb90)
*(arg1 + 0xb8c) = r0_205
*(arg1 + 0xb94) = r1_66

for (int32_t* i_13 = *(entry_r1 + 0xb90); i_13 != *(entry_r1 + 0xb94); i_13 = &i_13[2])
    *(*i_13 + 8)
    int32_t r0_209 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_23 = r0_209
    char var_2b_1 = *(i_13 + 5)
    int16_t var_2a_1 = *(i_13 + 6)
    int32_t* r0_213 = *(arg1 + 0xb94)
    
    if (r0_213 == *(arg1 + 0xb98))
        std::__ndk1::vector<ascension::AcquiredCardEvent, std::__ndk1::allocator<ascension::AcquiredCardEvent> >::__push_back_slow_path<ascension::AcquiredCardEvent const&>(
            arg1 + 0xb90)
    else
        int32_t r2_19 = i_13[1].b.d
        *r0_213 = r0_209
        r0_213[1] = r2_19
        *(arg1 + 0xb94) += 8

*(arg1 + 0xba0) = *(arg1 + 0xb9c)

for (int32_t* i_14 = *(entry_r1 + 0xb9c); i_14 != *(entry_r1 + 0xba0); i_14 = &i_14[2])
    *(*i_14 + 8)
    int32_t r0_222 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_24 = r0_222
    var_2c.w = i_14[1].w
    int16_t var_2a_2 = *(i_14 + 6)
    int32_t* r0_225 = *(arg1 + 0xba0)
    
    if (r0_225 == *(arg1 + 0xba4))
        std::__ndk1::vector<ascension::DefeatedMonsterEvent, std::__ndk1::allocator<ascension::DefeatedMonsterEvent> >::__push_back_slow_path<ascension::DefeatedMonsterEvent const&>(
            arg1 + 0xb9c)
    else
        *r0_225 = r0_222
        r0_225[1] = var_2c.d
        *(arg1 + 0xba0) += 8

*(arg1 + 0xbac) = *(arg1 + 0xba8)

for (int32_t* i_15 = *(entry_r1 + 0xba8); i_15 != *(entry_r1 + 0xbac); i_15 = &i_15[1])
    *(*i_15 + 8)
    int32_t r0_234 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_25 = r0_234
    int32_t var_30_16 = r0_234
    int32_t* r1_74 = *(arg1 + 0xbac)
    
    if (r1_74 == *(arg1 + 0xbb0))
        std::__ndk1::vector<ascension::CConstructAbilityInstance const*, std::__ndk1::allocator<ascension::CConstructAbilityInstance const*> >::__push_back_slow_path<ascension::CConstructAbilityInstance const* const&>(
            arg1 + 0xba8)
    else
        *r1_74 = r0_234
        *(arg1 + 0xbac) += 4

*(arg1 + 0xbb8) = *(arg1 + 0xbb4)

for (int32_t* i_16 = *(entry_r1 + 0xbb4); i_16 != *(entry_r1 + 0xbb8); i_16 = &i_16[1])
    *(*i_16 + 8)
    int32_t r0_243 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_26 = r0_243
    int32_t var_30_17 = r0_243
    int32_t* r1_76 = *(arg1 + 0xbb8)
    
    if (r1_76 == *(arg1 + 0xbbc))
        std::__ndk1::vector<ascension::CCardInPlayAbilityInstance const*, std::__ndk1::allocator<ascension::CCardInPlayAbilityInstance const*> >::__push_back_slow_path<ascension::CCardInPlayAbilityInstance const* const&>(
            arg1 + 0xbb4)
    else
        *r1_76 = r0_243
        *(arg1 + 0xbb8) += 4

*(arg1 + 0xbc4) = *(arg1 + 0xbc0)

for (int32_t* i_17 = *(entry_r1 + 0xbc0); i_17 != *(entry_r1 + 0xbc4); i_17 = &i_17[1])
    *(*i_17 + 8)
    int32_t r0_252 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_27 = r0_252
    int32_t var_30_18 = r0_252
    int32_t* r1_78 = *(arg1 + 0xbc4)
    
    if (r1_78 == *(arg1 + 0xbc8))
        std::__ndk1::vector<ascension::CConstructInstance const*, std::__ndk1::allocator<ascension::CConstructInstance const*> >::__push_back_slow_path<ascension::CConstructInstance const* const&>(
            arg1 + 0xbc0)
    else
        *r1_78 = r0_252
        *(arg1 + 0xbc4) += 4

*(arg1 + 0xbd0) = *(arg1 + 0xbcc)

for (int32_t* i_18 = *(entry_r1 + 0xbcc); i_18 != *(entry_r1 + 0xbd0); i_18 = &i_18[1])
    *(*i_18 + 8)
    int32_t r0_261 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_28 = r0_261
    int32_t var_30_19 = r0_261
    int32_t* r1_80 = *(arg1 + 0xbd0)
    
    if (r1_80 == *(arg1 + 0xbd4))
        std::__ndk1::vector<ascension::CActiveEffectInstance const*, std::__ndk1::allocator<ascension::CActiveEffectInstance const*> >::__push_back_slow_path<ascension::CActiveEffectInstance const* const&>(
            arg1 + 0xbcc)
    else
        *r1_80 = r0_261
        *(arg1 + 0xbd0) += 4

*(arg1 + 0xbdc) = *(arg1 + 0xbd8)

for (int32_t* i_19 = *(entry_r1 + 0xbd8); i_19 != *(entry_r1 + 0xbdc); i_19 = &i_19[2])
    *(*i_19 + 8)
    int32_t r0_270 = core::CWorldBase::GetInstanceByID(arg1)
    int32_t var_28_29 = r0_270
    var_2c.d = i_19[1]
    int32_t* r0_272 = *(arg1 + 0xbdc)
    
    if (r0_272 == *(arg1 + 0xbe0))
        std::__ndk1::vector<ascension::ResolveEvent, std::__ndk1::allocator<ascension::ResolveEvent> >::__push_back_slow_path<ascension::ResolveEvent const&>(
            arg1 + 0xbd8)
    else
        *r0_272 = r0_270
        r0_272[1] = var_2c.d
        *(arg1 + 0xbdc) += 8

if (*__stack_chk_guard == r0)
    return 1

__stack_chk_fail()
noreturn
