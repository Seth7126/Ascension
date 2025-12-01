// 函数: _ZN20NetworkClientManager20InsertActiveGameDataEP12AppWorldData
// 地址: 0x185afc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = *__stack_chk_guard
void* entry_r1
void* var_28 = entry_r1
int32_t r2_1 = *(entry_r1 + 0xa04)

if (r2_1 == 3)
    *(entry_r1 + 0xa10) = 4
else if (r2_1 == 2)
    int32_t r2_3 = *(entry_r1 + 0xa08)
    *(entry_r1 + 0xa10) = 6
    
    if (r2_3 != 0)
        void* r7_2 = entry_r1 + 0x14
        int32_t r3_5 = 0
        
        do
            if (*r7_2 == *(arg1 + 0xa4))
                if ((zx.d(*(entry_r1 + 0xd8)) & 1 << (r3_5 & 0xff)) != 0)
                    *(entry_r1 + 0xa10) = 1
                
                break
            
            r3_5 += 1
            r7_2 += 0x30
        while (r3_5 u< r2_3)
else if (r2_1 == 1)
    int32_t i_2 = *(entry_r1 + 0xa08)
    int32_t r4_1 = 0
    int32_t r12_1 = *(entry_r1 + 0xd4)
    int32_t r5_1 = 0
    
    if (r12_1 s>= i_2)
        r4_1 = 1
    
    if (i_2 != 0)
        void* r6_1 = entry_r1 + 0x1e
        int32_t i_1 = i_2
        int32_t i
        
        do
            int32_t r3_1 = *(r6_1 - 0xa)
            
            if (r3_1 == 0)
                r4_1 = 0
            else
                uint32_t r7_1 = zx.d(*r6_1)
                
                if (r7_1 != 1)
                    if (r7_1 == 2)
                        int32_t temp0_1 = 0
                        uint32_t j = r3_1 - *(arg1 + 0xa4)
                        
                        while (j != 0)
                            j u>>= 1
                            temp0_1 += 1
                        
                        r5_1 |= (0x20 - temp0_1) u>> 5
                    
                    r4_1 = 0
            
            r6_1 += 0x30
            i = i_1
            i_1 -= 1
        while (i != 1)
    
    int32_t r2_2
    
    if (i_2 != 0 && (r5_1 & 1) != 0)
        r2_2 = 5
    else if (r12_1 s< i_2)
        r2_2 = 9
    else if (*(entry_r1 + 0x14) != *(arg1 + 0xa4))
        r2_2 = 8
    else if ((r4_1 & 1) != 0)
        r2_2 = 3
    else
        r2_2 = 7
    
    *(entry_r1 + 0xa10) = r2_2

AppWorldData** r3_7 = *(arg1 + 0xdc)
void** r2_5 = *(arg1 + 0xe0)

if (r2_5 != r3_7)
    int32_t r7_4 = *(entry_r1 + 0xa10)
    
    do
        AppWorldData* r6_3 = *r3_7
        int32_t r5_3 = *(r6_3 + 0xa10)
        
        if (r7_4 u<= r5_3)
            if (r7_4 u< r5_3)
                std::__ndk1::vector<AppWorldData*, std::__ndk1::allocator<AppWorldData*> >::insert(
                    arg1 + 0xdc, r3_7)
                goto label_185ce4
            
            int32_t r5_4 = *(r6_3 + 0xe0)
            int32_t r4_3 = *(entry_r1 + 0xe0)
            
            if (r4_3 s> r5_4)
                std::__ndk1::vector<AppWorldData*, std::__ndk1::allocator<AppWorldData*> >::insert(
                    arg1 + 0xdc, r3_7)
                goto label_185ce4
            
            if (r4_3 s>= r5_4 && *(entry_r1 + 4) u< *(r6_3 + 4))
                std::__ndk1::vector<AppWorldData*, std::__ndk1::allocator<AppWorldData*> >::insert(
                    arg1 + 0xdc, r3_7)
                goto label_185ce4
        
        r3_7 = &r3_7[1]
    while (r2_5 != r3_7)

if (r2_5 == *(arg1 + 0xe4))
    std::__ndk1::vector<AppWorldData*, std::__ndk1::allocator<AppWorldData*> >::__push_back_slow_path<AppWorldData* const&>(
        arg1 + 0xdc)
else
    *r2_5 = entry_r1
    *(arg1 + 0xe0) += 4

label_185ce4:
int32_t r0_2 = *__stack_chk_guard

if (r0_2 == r2)
    return r0_2 - r2

__stack_chk_fail()
noreturn
