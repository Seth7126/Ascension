// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow40SelectAcquireOngoingVisionFromDreamscapeER13CStateMachineP6CStateiPj
// 地址: 0x12adf8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 

arg1 = *(arg2 + 0x25c)

if (arg1 s< 1)
    return 

ascension::CPlayer* r6_1 = *(arg2 + 0x24c)
int32_t r1 = 0
int32_t r2 = 0x260

do
    if (*(arg2 + r2) == arg3)
        core::CWorldBase::OutputMessageFormat(*(r6_1 + 4), "%s acquires %s from Dreamscape\n", 
            r6_1 + 0x10, (*(*arg3 + 0xc))(arg3))
        int32_t var_24 = 5
        ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
            operator new(0x990), r6_1, arg3, 0x14, zx.d(*(r6_1 + 8)))
        CState::AddOwnedChild(arg2)
        CStateList::AppendState(arg2)
        ascensionrules::CreateStatePlayVisionFromDreamscape(r6_1, arg3)
        CState::AddOwnedChild(arg2)
        CStateList::AppendState(arg2)
        *(arg2 + 0xcec) = 1
        return 
    
    r1 += 1
    r2 += 0x44
while (r1 s< arg1)
