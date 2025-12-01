// 函数: _ZN14ascensionrules32CStateAcquirePortalFromCenterRow26SelectAcquireFromCenterRowER13CStateMachineP6CStateiPj
// 地址: 0x161580
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg3 == 0)
    return 

void* r8_1 = *(arg2 + 0x24c)
int32_t r7_1 = 0
int32_t r6_1 = *(r8_1 + 4)

if (ascension::CWorld::GetCenterRowCard(r6_1) == arg3)
label_161650:
    int32_t* r0_13 = operator new(0x2b0)
    CGameStateOptions::CGameStateOptions(r0_13.b)
    r0_13[0x99].w = 0
    *r0_13 = _vtable_for_ascensionrules::CStateProcessAcquirePortal + 8
    *(r0_13 + 0x266) = 0
    r0_13[0x93] = r8_1
    r0_13[0x94] = arg3
    r0_13[0x95] = 7
    r0_13[0x96] = r7_1
    r0_13[0x97] = 3
    r0_13[0x98] = 0
    CState::AddOwnedChild(arg2)
    return CStateList::AppendState(arg2) __tailcall

r7_1 = 1

if (ascension::CWorld::GetCenterRowCard(r6_1) == arg3)
    goto label_161650

r7_1 = 2

if (ascension::CWorld::GetCenterRowCard(r6_1) == arg3)
    goto label_161650

r7_1 = 3

if (ascension::CWorld::GetCenterRowCard(r6_1) == arg3)
    goto label_161650

r7_1 = 4

if (ascension::CWorld::GetCenterRowCard(r6_1) == arg3)
    goto label_161650

r7_1 = 5

if (ascension::CWorld::GetCenterRowCard(r6_1) == arg3)
    goto label_161650

r7_1 = 6

if (ascension::CWorld::GetCenterRowCard(r6_1) == arg3)
    goto label_161650
