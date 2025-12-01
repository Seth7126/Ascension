// 函数: _ZN9ascension6CWorld18CreateKingdomStackEjPKci
// 地址: 0xf4430
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (ascension::CDatabase::GetCard(ascension::g_Database) != 0)
    core::CWorldBase* r0_3 = operator new(0x18)
    ascension::CCardStackUniformAscension::CCardStackUniformAscension(r0_3, arg1, arg2)
    core::CWorldBase* var_28_1 = r0_3
    core::CWorldBase::AddInstance(arg1)
    core::CCardStackUniform::SetCardCount(r0_3)
    ascension::CCardStackUniformAscension::CreateSampleCardInstance()
    core::CWorldBase** r0_7 = *(arg1 + 0xa34)
    
    if (r0_7 == *(arg1 + 0xa38))
        std::__ndk1::vector<ascension::CCardStackUniformAscension*, std::__ndk1::allocator<ascension::CCardStackUniformAscension*> >::__push_back_slow_path<ascension::CCardStackUniformAscension* const&>(
            arg1 + 0xa30)
    else
        *r0_7 = r0_3
        *(arg1 + 0xa34) += 4

int32_t r0_11 = *__stack_chk_guard

if (r0_11 == r0)
    return r0_11 - r0

__stack_chk_fail()
noreturn
