// 函数: _ZN9ascension6CWorld23CreateEndOfRainbowStackEjPKci
// 地址: 0xf4ec4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = *(arg1 + 0xa68)

if (result == 0)
    result = ascension::CDatabase::GetCard(ascension::g_Database)
    
    if (result != 0)
        core::CWorldBase* r0_1 = operator new(0x18)
        ascension::CCardStackUniformAscension::CCardStackUniformAscension(r0_1, arg1, arg2)
        core::CWorldBase::AddInstance(arg1)
        core::CCardStackUniform::SetCardCount(r0_1)
        result = ascension::CCardStackUniformAscension::CreateSampleCardInstance()
        *(arg1 + 0xa68) = r0_1

return result
