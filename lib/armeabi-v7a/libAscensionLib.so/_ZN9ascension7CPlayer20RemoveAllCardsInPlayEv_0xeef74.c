// 函数: _ZN9ascension7CPlayer20RemoveAllCardsInPlayEv
// 地址: 0xeef74
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* entry_r0
ascension::CActiveEffectInstance* r5 = *(entry_r0 + 4)

for (int32_t i = *(entry_r0 + 0x4c); *(entry_r0 + 0x48) != i; i = *(entry_r0 + 0x4c))
    void* r7_1 = *(i - 4)
    *(entry_r0 + 0x4c) = i - 4
    int32_t* j = *(r7_1 + 0x14)
    
    while (j != *(r7_1 + 0x18))
        *j
        j = &j[1]
        ascension::CWorld::RemoveActiveEffect(r5)
    
    void* var_2c_1 = r7_1
    void** r0_4 = *(entry_r0 + 0x70)
    
    if (r0_4 u>= *(entry_r0 + 0x74))
        std::__ndk1::vector<core::CInstance*, std::__ndk1::allocator<core::CInstance*> >::__push_back_slow_path<core::CInstance*>(
            entry_r0 + 0x6c)
    else
        *r0_4 = r7_1
        *(entry_r0 + 0x70) += 4

for (int32_t i_1 = *(entry_r0 + 0x58); *(entry_r0 + 0x54) != i_1; i_1 = *(entry_r0 + 0x58))
    void* r7_2 = *(i_1 - 4)
    *(entry_r0 + 0x58) = i_1 - 4
    int32_t* j_1 = *(r7_2 + 0x14)
    
    while (j_1 != *(r7_2 + 0x18))
        *j_1
        j_1 = &j_1[1]
        ascension::CWorld::RemoveActiveEffect(r5)
    
    void* var_2c_2 = r7_2
    void** r0_11 = *(entry_r0 + 0x70)
    
    if (r0_11 u>= *(entry_r0 + 0x74))
        std::__ndk1::vector<core::CInstance*, std::__ndk1::allocator<core::CInstance*> >::__push_back_slow_path<core::CInstance*>(
            entry_r0 + 0x6c)
    else
        *r0_11 = r7_2
        *(entry_r0 + 0x70) += 4

for (int32_t i_2 = *(entry_r0 + 0x64); *(entry_r0 + 0x60) != i_2; i_2 = *(entry_r0 + 0x64))
    int32_t r1_9 = *(i_2 - 4)
    *(entry_r0 + 0x64) = i_2 - 4
    int32_t var_2c_3 = r1_9
    int32_t* r0_16 = *(entry_r0 + 0x70)
    
    if (r0_16 u>= *(entry_r0 + 0x74))
        std::__ndk1::vector<core::CInstance*, std::__ndk1::allocator<core::CInstance*> >::__push_back_slow_path<core::CInstance*>(
            entry_r0 + 0x6c)
    else
        *r0_16 = r1_9
        *(entry_r0 + 0x70) += 4

int32_t r0_20 = *__stack_chk_guard

if (r0_20 == r0)
    return r0_20 - r0

__stack_chk_fail()
noreturn
