// 函数: _ZN9ascension7CPlayer19ProcessRollbackDataEPN4core12RollbackDataE
// 地址: 0xef650
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
core::CInstance* r0_15
void* entry_r1
int96_t q0
int96_t q1

switch (*(entry_r1 + 8) - 0x10111)
    case 0
        *(entry_r1 + 0xc)
        void* r0_6 = *(core::CWorldBase::GetInstanceByID(*(arg1 + 4)) + 0xc)
        int32_t r1_2 = *(r0_6 + 0x88) - 1
        
        if (r1_2 u<= 5)
            void* r1_3 = arg1 + (r1_2 << 5)
            q0.d = *(r1_3 + 0xb8)
            q0:8.d = *(r1_3 + 0xbc)
            q1.d = *(r1_3 + 0xc0)
            q1:8.d = *(r1_3 + 0xc4)
            *(r1_3 + 0xb4) -= 1
            q0.d = q0.d f- *(r0_6 + 0x168)
            *(r1_3 + 0xb8) = q0.d
            q0.d = *(r0_6 + 0x16c)
            q0.d = q0:8.d f- q0.d
            *(r1_3 + 0xbc) = q0.d
            q0.d = *(r0_6 + 0x170)
            int32_t r2_3 = *(r1_3 + 0xd0)
            q0.d = q1.d f- q0.d
            *(r1_3 + 0xc0) = q0.d
            *(r1_3 + 0xd0) = r2_3 - *(r0_6 + 0x180)
            q0.d = *(r0_6 + 0x174)
            q0.d = q1:8.d f- q0.d
            *(r1_3 + 0xc4) = q0.d
            q0.d = *(r1_3 + 0xc8)
            q0:8.d = *(r0_6 + 0x178)
            q0.d = q0.d f- q0:8.d
            *(r1_3 + 0xc8) = q0.d
            q0.d = *(r1_3 + 0xcc)
            q0:8.d = *(r0_6 + 0x17c)
            q0.d = q0.d f- q0:8.d
            *(r1_3 + 0xcc) = q0.d
    case 1
        *(entry_r1 + 0xc)
        void* r0_9 = *(core::CWorldBase::GetInstanceByID(*(arg1 + 4)) + 0xc)
        int32_t r1_6 = *(r0_9 + 0x88) - 1
        
        if (r1_6 u<= 5)
            void* r1_7 = arg1 + (r1_6 << 5)
            q0.d = *(r1_7 + 0xb8)
            q0:8.d = *(r1_7 + 0xbc)
            q1.d = *(r1_7 + 0xc0)
            q1:8.d = *(r1_7 + 0xc4)
            *(r1_7 + 0xb4) += 1
            q0.d = *(r0_9 + 0x168) f+ q0.d
            *(r1_7 + 0xb8) = q0.d
            q0.d = *(r0_9 + 0x16c)
            q0.d = q0.d f+ q0:8.d
            *(r1_7 + 0xbc) = q0.d
            q0.d = *(r0_9 + 0x170)
            int32_t r2_7 = *(r1_7 + 0xd0)
            q0.d = q0.d f+ q1.d
            *(r1_7 + 0xc0) = q0.d
            *(r1_7 + 0xd0) = r2_7 + *(r0_9 + 0x180)
            q0.d = *(r0_9 + 0x174)
            q0.d = q0.d f+ q1:8.d
            *(r1_7 + 0xc4) = q0.d
            q0.d = *(r1_7 + 0xc8)
            q0:8.d = *(r0_9 + 0x178)
            q0.d = q0:8.d f+ q0.d
            *(r1_7 + 0xc8) = q0.d
            q0.d = *(r1_7 + 0xcc)
            q0:8.d = *(r0_9 + 0x17c)
            q0.d = q0:8.d f+ q0.d
            *(r1_7 + 0xcc) = q0.d
    case 2
        *(arg1 + 0x88) = *(entry_r1 + 0xc)
    case 3
        *(arg1 + 0x8c) = *(entry_r1 + 0xc)
    case 4
        *(arg1 + 0x90) = *(entry_r1 + 0xc)
    case 5
        *(arg1 + 0x94) = *(entry_r1 + 0xc)
    case 6
        *(arg1 + 0x98) = *(entry_r1 + 0xc)
    case 7
        *(arg1 + 0xa0) = *(entry_r1 + 0xc)
    case 8
        *(arg1 + 0x9c) = *(entry_r1 + 0xc)
    case 9
        *(arg1 + 0xac) = *(entry_r1 + 0xc)
    case 0xa
        *(arg1 + 0xb0) = *(entry_r1 + 0xc)
    case 0xb
        int32_t r0_13 = *(entry_r1 + 0xc)
        
        if (r0_13 != 0)
            r0_13 = 1
        
        *(arg1 + 0xa4) = r0_13.b
    case 0xc
        *(arg1 + 0xa8) = *(entry_r1 + 0xc)
    case 0x10
        int32_t* r2_10 = *(arg1 + 0x4c) - 4
        int32_t var_18_1 = *r2_10
        r0_15 = *(arg1 + 4)
        *(arg1 + 0x4c) = r2_10
        core::CWorldBase::RollbackInstance(r0_15)
    case 0x11
        int32_t* r0_26 = *(arg1 + 0x70) - 4
        int32_t var_18_3 = *r0_26
        *(arg1 + 0x70) = r0_26
        int32_t i_4 = *(entry_r1 + 0x10)
        ascension::CCardInPlayInstance** r3_4 = *(arg1 + 0x48)
        
        if (i_4 != 0)
            int32_t i
            
            do
                i = i_4
                i_4 -= 1
                r3_4 = &r3_4[1]
            while (i != 1)
        
        std::__ndk1::vector<ascension::CCardInPlayInstance*, std::__ndk1::allocator<ascension::CCardInPlayInstance*> >::insert(
            arg1 + 0x48, r3_4)
    case 0x12
        int32_t* r2_14 = *(arg1 + 0x58) - 4
        int32_t var_18_4 = *r2_14
        r0_15 = *(arg1 + 4)
        *(arg1 + 0x58) = r2_14
        core::CWorldBase::RollbackInstance(r0_15)
    case 0x13
        int32_t* r0_29 = *(arg1 + 0x70) - 4
        int32_t var_18_5 = *r0_29
        *(arg1 + 0x70) = r0_29
        int32_t i_5 = *(entry_r1 + 0x10)
        ascension::CConstructInstance** r3_5 = *(arg1 + 0x54)
        
        if (i_5 != 0)
            int32_t i_1
            
            do
                i_1 = i_5
                i_5 -= 1
                r3_5 = &r3_5[1]
            while (i_1 != 1)
        
        std::__ndk1::vector<ascension::CConstructInstance*, std::__ndk1::allocator<ascension::CConstructInstance*> >::insert(
            arg1 + 0x54, r3_5)
    case 0x14
        int32_t* r2_17 = *(arg1 + 0x64) - 4
        int32_t var_18_6 = *r2_17
        r0_15 = *(arg1 + 4)
        *(arg1 + 0x64) = r2_17
        core::CWorldBase::RollbackInstance(r0_15)
    case 0x15
        int32_t* r0_17 = *(arg1 + 0x70) - 4
        int32_t var_18_2 = *r0_17
        *(arg1 + 0x70) = r0_17
        int32_t i_3 = *(entry_r1 + 0x10)
        ascension::CTrophyInstance** r3_3 = *(arg1 + 0x60)
        
        if (i_3 != 0)
            int32_t i_2
            
            do
                i_2 = i_3
                i_3 -= 1
                r3_3 = &r3_3[1]
            while (i_2 != 1)
        
        std::__ndk1::vector<ascension::CTrophyInstance*, std::__ndk1::allocator<ascension::CTrophyInstance*> >::insert(
            arg1 + 0x60, r3_3)

int32_t r0_31 = *__stack_chk_guard

if (r0_31 == r0)
    return r0_31 - r0

__stack_chk_fail()
noreturn
