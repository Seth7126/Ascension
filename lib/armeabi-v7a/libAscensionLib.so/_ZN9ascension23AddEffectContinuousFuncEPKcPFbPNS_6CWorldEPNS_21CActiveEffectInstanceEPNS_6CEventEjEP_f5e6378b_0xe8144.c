// 函数: _ZN9ascension23AddEffectContinuousFuncEPKcPFbPNS_6CWorldEPNS_21CActiveEffectInstanceEPNS_6CEventEjEPKj
// 地址: 0xe8144
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = *__stack_chk_guard
int32_t var_2c = 0
bool (* var_30)(ascension::CWorld*, ascension::CActiveEffectInstance*, ascension::CEvent*, 
    uint32_t) = nullptr

if (arg3 != 0)
    uint32_t const i_1 = *arg3
    
    if (i_1 != 0)
        void* r1 = &arg3[1]
        bool (* r2)(ascension::CWorld*, ascension::CActiveEffectInstance*, ascension::CEvent*, 
            uint32_t) = nullptr
        int32_t r5_1 = 0
        uint32_t i
        
        do
            int32_t r4_1 = 1 << i_1
            i = *r1
            r1 += 4
            uint32_t r3_2 = 1 u>> (0x20 - i_1)
            
            if (i_1 - 0x20 s>= 0)
                r4_1 = 0
                r3_2 = 1 << (i_1 - 0x20)
            
            r5_1 |= r3_2
            r2 |= r4_1
            i_1 = i
        while (i != 0)
        var_30 = r2
        var_2c = r5_1

bool (** r1_1)(ascension::CWorld*, ascension::CActiveEffectInstance*, ascension::CEvent*, 
    uint32_t) = *(ascension::s_EffectContinuousFuncList + 4)

if (r1_1 == *(ascension::s_EffectContinuousFuncList + 8))
    std::__ndk1::vector<ascension::EffectContinuousFuncEntry, std::__ndk1::allocator<ascension::EffectContinuousFuncEntry> >::__push_back_slow_path<ascension::EffectContinuousFuncEntry const&>(
        ascension::s_EffectContinuousFuncList)
else
    *r1_1 = arg1
    r1_1[1] = arg2
    r1_1[2] = var_30
    r1_1[3] = var_2c
    *(ascension::s_EffectContinuousFuncList + 4) = &r1_1[4]

int32_t r0_1 = *__stack_chk_guard

if (r0_1 == r3)
    return r0_1 - r3

__stack_chk_fail()
noreturn
