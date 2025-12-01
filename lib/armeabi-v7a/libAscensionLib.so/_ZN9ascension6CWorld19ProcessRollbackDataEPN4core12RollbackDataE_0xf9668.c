// 函数: _ZN9ascension6CWorld19ProcessRollbackDataEPN4core12RollbackDataE
// 地址: 0xf9668
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* entry_r1
core::CCardInstance** r1_25
void* __offset(core::RollbackData, 0xa7c) r4_3

switch (*(entry_r1 + 8) - 0x10010)
    case nullptr
        int32_t r0_5 = *(entry_r1 + 0xc)
        
        if (r0_5 != 0)
            r0_5 = 1
        
        *(arg1 + 0xb28) = r0_5.b
    case 1
        int32_t r0_6 = *(entry_r1 + 0xc)
        
        if (r0_6 != 0)
            r0_6 = 1
        
        *(arg1 + 0xb29) = r0_6.b
    case 2
        int32_t r0_7 = *(entry_r1 + 0xc)
        
        if (r0_7 != 0)
            r0_7 = 1
        
        *(arg1 + 0xb2a) = r0_7.b
    case 3
        int32_t r0_8 = *(entry_r1 + 0xc)
        
        if (r0_8 != 0)
            r0_8 = 1
        
        *(arg1 + 0xb2b) = r0_8.b
    case 4
        int32_t r0_9 = *(entry_r1 + 0xc)
        
        if (r0_9 != 0)
            r0_9 = 1
        
        *(arg1 + 0xb2c) = r0_9.b
    case 5
        int32_t r0_10 = *(entry_r1 + 0xc)
        
        if (r0_10 != 0)
            r0_10 = 1
        
        *(arg1 + 0xb30) = r0_10
    case 6
        int32_t r0_11 = *(entry_r1 + 0xc)
        
        if (r0_11 != 0)
            r0_11 = 1
        
        *(arg1 + 0xb34) = r0_11.b
    case 7
        *(arg1 + 0xb38) = *(entry_r1 + 0xc)
    case 8
        int32_t r0_13 = *(entry_r1 + 0xc)
        
        if (r0_13 != 0)
            r0_13 = 1
        
        *(arg1 + 0xb3c) = r0_13.b
    case 9
        int32_t r0_14 = *(entry_r1 + 0xc)
        
        if (r0_14 != 0)
            r0_14 = 1
        
        *(arg1 + 0xb3d) = r0_14.b
    case 0xa
        *(arg1 + 0xb40) = *(entry_r1 + 0xc)
    case 0xb
        *(arg1 + 0xb44) = *(entry_r1 + 0xc)
    case 0xc
        *(arg1 + 0xb48) = *(entry_r1 + 0xc)
    case 0xd
        *(arg1 + 0xb4c) = *(entry_r1 + 0xc)
    case 0xe
        *(arg1 + 0xb50) = *(entry_r1 + 0xc)
    case 0xf
        *(arg1 + 0xb54) = *(entry_r1 + 0xc)
    case 0x10
        *(arg1 + 0xb58) = *(entry_r1 + 0xc)
    case 0x11
        *(arg1 + 0xb5c) = *(entry_r1 + 0xc)
    case 0x12
        *(arg1 + 0xb60) = *(entry_r1 + 0xc)
    case 0x13
        *(arg1 + 0xb64) = *(entry_r1 + 0xc)
    case 0x14
        *(arg1 + 0xb68) = *(entry_r1 + 0xc)
    case 0x15
        *(arg1 + 0xb6c) = *(entry_r1 + 0xc)
    case 0x16
        *(arg1 + 0xb7c) = *(entry_r1 + 0xc)
    case 0x17
        *(arg1 + 0xb0c) = *(entry_r1 + 0xc)
    case 0x18
        if (*(entry_r1 + 0xc) == 0)
            *(arg1 + 0xb24) = 0
        else
            *(arg1 + 0xb24) = core::CWorldBase::GetInstanceByID(arg1)
    case 0x19
        int32_t r0_31 = *(entry_r1 + 0xc)
        
        if (r0_31 != 0)
            r0_31 = 1
        
        *(arg1 + 0xb1c) = r0_31.b
    case 0x20
        *(entry_r1 + 0xc)
        int32_t var_28_1 = core::CWorldBase::GetInstanceByID(arg1)
        *(arg1 + 0xac0) -= 4
        core::CWorldBase::RollbackInstance(arg1)
    case 0x21
        int32_t* r1_3 = *(arg1 + 0xaa4)
        uint32_t r0_36 = zx.d(*(entry_r1 + 0x10))
        int32_t r2_1 = *(arg1 + 0xaa8)
        int32_t* r6_2 = &r1_3[r0_36]
        int32_t var_30_1 = *r6_2
        
        if (r0_36 == 0)
            r6_2 = r1_3
        
        if (r2_1 != &r6_2[1])
            __aeabi_memmove4(r6_2)
        
        *(arg1 + 0xaa8) = &r6_2[(r2_1 - &r6_2[1]) s>> 2]
        
        if (ascension::CActiveEffectInstance::HasEffectDuration() != 0)
            core::CWorldBase::RollbackInstance(arg1)
    case 0x22
        int32_t* r0_43 = *(arg1 + 0xab4) - 4
        int32_t var_30_2 = *r0_43
        *(arg1 + 0xab4) = r0_43
        uint32_t r0_44 = zx.d(*(entry_r1 + 0x10))
        ascension::CActiveEffectInstance** r1_7 = *(arg1 + 0xaa4)
        
        if (r0_44 != 0)
            int32_t i_7 = 0 - r0_44
            int32_t i
            
            do
                i = i_7
                i_7 += 1
                r1_7 = &r1_7[1]
            while (i != 0xffffffff)
        
        std::__ndk1::vector<ascension::CActiveEffectInstance*, std::__ndk1::allocator<ascension::CActiveEffectInstance*> >::insert(
            arg1 + 0xaa4, r1_7)
    case 0x23
        int32_t* r0_47 = *(arg1 + 0xa90) - 4
        int32_t var_30_3 = *r0_47
        *(arg1 + 0xa90) = r0_47
        core::CWorldBase::RollbackInstance(arg1)
    case 0x2a
        int32_t r0_49 = *(arg1 + 0xb94)
        
        if (r0_49 != *(arg1 + 0xb90) && *(entry_r1 + 0xc) == zx.d(*(*(r0_49 - 8) + 8)))
            *(arg1 + 0xb94) = r0_49 - 8
    case 0x2b
        int32_t r0_51 = *(arg1 + 0xba0)
        
        if (r0_51 != *(arg1 + 0xb9c) && *(entry_r1 + 0xc) == zx.d(*(*(r0_51 - 8) + 8)))
            *(arg1 + 0xba0) = r0_51 - 8
    case 0x31
        int32_t i_12 = *(entry_r1 + 0xc)
        *(arg1 + 0xb84) = *(arg1 + 0xb80)
        
        if (i_12 s>= 1)
            void* r5_3 = entry_r1 + 0x10
            int32_t i_1
            
            do
                *r5_3
                int32_t r0_55 = core::CWorldBase::GetInstanceByID(arg1)
                int32_t var_28_2 = r0_55
                int32_t r0_56 = *(r5_3 + 4)
                int32_t* r0_57 = *(arg1 + 0xb84)
                
                if (r0_57 == *(arg1 + 0xb88))
                    std::__ndk1::vector<ascension::PlayedCardEvent, std::__ndk1::allocator<ascension::PlayedCardEvent> >::__push_back_slow_path<ascension::PlayedCardEvent const&>(
                        arg1 + 0xb80)
                else
                    *r0_57 = r0_55
                    r0_57[1] = r0_56
                    *(arg1 + 0xb84) += 8
                
                r5_3 += 8
                i_1 = i_12
                i_12 -= 1
            while (i_1 != 1)
    case 0x32
        *(arg1 + 0xb84) -= 8
    case 0x33
        *(arg1 + 0xbac) -= 4
    case 0x34
        *(arg1 + 0xbb8) -= 4
    case 0x35
        *(arg1 + 0xbc4) -= 4
    case 0x36
        *(arg1 + 0xbd0) -= 4
    case 0x37
        *(*(arg1 + 0xb80) + (*(entry_r1 + 0x10) << 3) + 4) = *(entry_r1 + 0xc)
    case 0x38
        *(arg1 + 0xbdc) -= 8
    case 0x39
        *(entry_r1 + 0xc)
        uint32_t r6_5 = zx.d(*(entry_r1 + 0x14))
        int32_t r0_75 = core::CWorldBase::GetInstanceByID(arg1)
        int32_t var_28_3 = r0_75
        int32_t var_38_1 = r0_75
        int32_t var_34_1 = *(entry_r1 + 0x10)
        ascension::ResolveEvent* r1_21 = *(arg1 + 0xbd8)
        
        if (r6_5 != 0)
            int32_t i_8 = 0 - r6_5
            int32_t i_2
            
            do
                i_2 = i_8
                i_8 += 1
                r1_21 += 8
            while (i_2 != 0xffffffff)
        
        std::__ndk1::vector<ascension::ResolveEvent, std::__ndk1::allocator<ascension::ResolveEvent> >::insert(
            arg1 + 0xbd8, r1_21)
    case 0x41
        *(arg1 + 0xa6c)
        core::CWorldBase::RollbackInstance(arg1)
        *(arg1 + 0xa6c) = 0
    case 0x42
        int32_t* r0_80 = *(arg1 + 0xa9c) - 4
        *(arg1 + 0xa6c) = *r0_80
        *(arg1 + 0xa9c) = r0_80
    case 0x43
        *(arg1 + 0xa74) -= 4
    case 0x44
        *(entry_r1 + 0xc)
        int32_t var_28_4 = core::CWorldBase::GetInstanceByID(arg1)
        uint32_t r0_85 = zx.d(*(entry_r1 + 0x10))
        r4_3 = arg1 + 0xa70
        r1_25 = *r4_3
        
        if (r0_85 != 0)
            int32_t i_9 = 0 - r0_85
            int32_t i_3
            
            do
                i_3 = i_9
                i_9 += 1
                r1_25 = &r1_25[1]
            while (i_3 != 0xffffffff)
        
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::insert(
            r4_3, r1_25)
    case 0x45
        *(arg1 + 0xa80) -= 4
    case 0x46
        *(entry_r1 + 0xc)
        int32_t var_28_5 = core::CWorldBase::GetInstanceByID(arg1)
        uint32_t r0_90 = zx.d(*(entry_r1 + 0x10))
        r4_3 = arg1 + 0xa7c
        r1_25 = *r4_3
        
        if (r0_90 != 0)
            int32_t i_10 = 0 - r0_90
            int32_t i_4
            
            do
                i_4 = i_10
                i_10 += 1
                r1_25 = &r1_25[1]
            while (i_4 != 0xffffffff)
        
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::insert(
            r4_3, r1_25)
    case 0x51
        *(arg1 + 0xb74) -= 8
    case 0x52
        int32_t var_30_5 = *(entry_r1 + 0xc)
        int32_t var_2c_2 = *(entry_r1 + 0x10)
        uint32_t r0_95 = zx.d(*(entry_r1 + 0x14))
        ascension::ConvertRunesToHonorEvent* r1_28 = *(arg1 + 0xb70)
        
        if (r0_95 != 0)
            int32_t i_11 = 0 - r0_95
            int32_t i_5
            
            do
                i_5 = i_11
                i_11 += 1
                r1_28 += 8
            while (i_5 != 0xffffffff)
        
        std::__ndk1::vector<ascension::ConvertRunesToHonorEvent, std::__ndk1::allocator<ascension::ConvertRunesToHonorEvent> >::insert(
            arg1 + 0xb70, r1_28)
    case 0x61
        *(entry_r1 + 0xc)
        void* r0_98 = core::CWorldBase::GetInstanceByID(arg1)
        void* var_28_6 = r0_98
        int32_t r1_30 = *(arg1 + 0xac8)
        int32_t r2_7 = *(arg1 + 0xacc)
        
        if (r2_7 != r1_30)
            int32_t i_6 = 0
            
            do
                if (zx.d(*(r0_98 + 8)) == zx.d(*(*(r1_30 + (i_6 << 3)) + 8)))
                    *(r1_30 + (i_6 << 3) + 4) = 0
                    break
                
                i_6 += 1
            while (i_6 u< (r2_7 - r1_30) s>> 3)
    case 0x62
        *(arg1 + 0xacc) -= 8
    case 0x63
        *(arg1 + 0xb10) = *(entry_r1 + 0xc)

int32_t r0_104 = *__stack_chk_guard

if (r0_104 == r0)
    return r0_104 - r0

__stack_chk_fail()
noreturn
