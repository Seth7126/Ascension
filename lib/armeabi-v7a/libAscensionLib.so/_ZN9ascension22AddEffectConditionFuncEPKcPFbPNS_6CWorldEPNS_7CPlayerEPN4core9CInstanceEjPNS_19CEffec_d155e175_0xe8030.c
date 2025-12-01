// 函数: _ZN9ascension22AddEffectConditionFuncEPKcPFbPNS_6CWorldEPNS_7CPlayerEPN4core9CInstanceEjPNS_19CEffectInstanceDataEPNS_6CEventEE
// 地址: 0xe8030
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = *__stack_chk_guard
bool (** r3)(ascension::CWorld*, ascension::CPlayer*, core::CInstance*, uint32_t, 
    ascension::CEffectInstanceData*, ascension::CEvent*) = *(ascension::s_EffectConditionFuncList + 4)

if (r3 == *(ascension::s_EffectConditionFuncList + 8))
    std::__ndk1::vector<ascension::EffectConditionFuncEntry, std::__ndk1::allocator<ascension::EffectConditionFuncEntry> >::__push_back_slow_path<ascension::EffectConditionFuncEntry const&>(
        ascension::s_EffectConditionFuncList)
else
    *r3 = arg1
    r3[1] = arg2
    *(ascension::s_EffectConditionFuncList + 4) += 8

int32_t r0_4 = *__stack_chk_guard

if (r0_4 == r2)
    return r0_4 - r2

__stack_chk_fail()
noreturn
